package com.app.entities

import com.app.database.Connector
import com.app.database.Queries
import com.app.utilies.Utility
import java.util.*

class Book {
    var id: Int = 0
    var title: String = ""
    var authors: String = ""
    var price: Double = 0.0
    var stock: Int = 0

//    override fun toString(): String {
//        return """
//            id=${id},
//            title=${title},
//            authors=${authors},
//            price=${price},
//            stock=${stock}
//        """.trimIndent()
//    }

//    private val dbName: String = "kotlindb"
//    private val sql: String = "select * from book"

    fun findAllByBookList(): ArrayList<Book> {
        var query = Queries(Connector().getCT("kotlindb"))
        var listMap = query.queriesList("select * from book")

        var list = ArrayList<Book>()
        for (i in 1..listMap.size) {
            list.add(query.convertProp(i - 1, listMap, Book()) as Book)
        }
        return list
    }

    fun findAllByListMap(): ArrayList<Map<String, Any>> {
        var query = Queries(Connector().getCT("kotlindb"))
        return query.queriesList("select * from book")
    }

    //override to string
    override fun toString() = Utility().reflectionToString(this)

}