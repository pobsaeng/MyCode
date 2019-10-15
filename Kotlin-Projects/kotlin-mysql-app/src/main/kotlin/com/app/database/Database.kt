package com.app.database

import java.sql.*
import java.util.*

class Database {
    private var connect: Connection? = null

    init {
        try {
            Class.forName(DatabaseInfo.DRIVER)

            connect = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USER, DatabaseInfo.PASSWORD)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    fun querySingle(sql: String, vararg args: Any): Map<String, Any>? {
        try {
            val pstmt = connect!!.prepareStatement(sql)

            for (i in args.indices) {
                pstmt.setObject(i + 1, args[i])
            }

            val rs = pstmt.executeQuery()
            val md = rs.metaData

            if (rs.next()) {
                val map = HashMap<String, Any>()

                for (i in 1..md.columnCount) {
                    map[md.getColumnLabel(i)] = rs.getObject(i)
                }

                return map
            } else {
                return null
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    fun queryList(sql: String, vararg args: Any): List<Map<String, Any>> {
        try {
            val list = ArrayList<Map<String, Any>>()

            val pstmt = connect!!.prepareStatement(sql)
            if (args != null) {
                for (i in args.indices) {
                    pstmt.setObject(i + 1, args[i])
                }
            }

            val rs = pstmt.executeQuery()
            val md = rs.metaData

            while (rs.next()) {
                val map = HashMap<String, Any>()

                for (i in 1..md.columnCount) {
                    map[md.getColumnLabel(i)] = rs.getObject(i)
                }

                list.add(map)
            }

            return list
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    fun add(sql: String, vararg args: Any): Int {
        try {
            val pstmt = connect!!.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)

            for (i in args.indices) {
                pstmt.setObject(i + 1, args[i])
            }

            pstmt.executeUpdate()

            // Find Auto Increment Id
            val rs = pstmt.generatedKeys

            rs.next()

            return rs.getInt(1)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    fun update(sql: String, vararg args: Any): Int {
        try {
            val pstmt = connect!!.prepareStatement(sql)

            for (i in args.indices) {
                pstmt.setObject(i + 1, args[i])
            }

            return pstmt.executeUpdate()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    fun remove(sql: String, id: Int): Int {
        return update(sql, id)
    }

    fun beginTransaction() {
        try {
            connect!!.autoCommit = false
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    fun commit() {
        try {
            connect!!.commit()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    fun rollback() {
        try {
            connect!!.rollback()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    fun close() {
        try {
            if (connect != null) {
                connect!!.close()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }
}