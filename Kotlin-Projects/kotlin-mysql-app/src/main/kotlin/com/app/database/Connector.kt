package com.app.database

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class Connector {

    fun getCT(dbStr: String): Connection {
        var username = "root"
        var password = "Kraipob1234"

        var condb: Connection? = null

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance()
            condb = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/$dbStr", username, password
            )
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } catch (ex: Exception) {
            // handle any errors
            ex.printStackTrace()
        }
        return condb!!
    }
}