package com.app.database

import java.sql.Connection
import java.sql.ResultSet

class Queries(var conn: Connection) {

    fun getResultSet(str: String): ResultSet {
        var rs: ResultSet? = null
        try {
            val stmt = conn!!.createStatement()
            rs = stmt.executeQuery(str)

        } catch (e: Exception) {
            System.err.println("Got an exception! ")
            System.err.println(e.message)
        }

        return rs!!
    }

    fun queriesList(str: String): ArrayList<Map<String, Any>> {
        var rs: ResultSet? = null

        try {
            val stmt = conn!!.createStatement()
            rs = stmt.executeQuery(str)

            val meta = rs.metaData
            val colCount = meta.columnCount
            var list = ArrayList<Map<String, Any>>()

            while (rs.next()) {
                var map = hashMapOf<String, Any>()

                for (col in 1..colCount) {
                    map.put(meta.getColumnLabel(col), rs.getObject(col))
                }
                list.add(map)
            }
            rs.close()
            conn.close()

            return list!!

        } catch (e: Exception) {
            System.err.println("Got an exception! ")
            System.err.println(e.message)
        }
        return null!!

    }

    fun convertProp(i: Int, listMap: ArrayList<Map<String, Any>>, instant: Any): Any {
        var clazz = Class.forName(instant.javaClass.name)

        listMap[i].forEach { (key, value) ->

            val fieldNAME = clazz.getDeclaredField(key)
            fieldNAME.isAccessible = true
            fieldNAME.set(instant, value)
        }
        return instant
    }
}