package com.app.entities

import com.pure.kotlin.databases.Queries
import com.pure.kotlin.helper.Utility
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import java.util.*

class Book {
    var id: Int = 0
    var title: String = ""
    var authors: String = ""
    var price: Double = 0.0
    var stock: Int = 0

    @Autowired
    var jdbcTemplate: JdbcTemplate? = null

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
//        var query = Queries(Connector().getCT("kotlindb"))
//        var listMap = query.queriesList("select * from book")

//        var listMap = jdbcTemplate!!.dataSource.connection

//        var list = ArrayList<Book>()
//        for(i in 1..listMap.size) {
//            list.add(Utility().convertProp(i-1, listMap, Book()) as Book)
//        }

        return jdbcTemplate!!.queryForList("select * from book") as ArrayList<Book>
    }

    fun findAllByListMap(): ArrayList<Map<String, Any>> {
        var query = Queries(jdbcTemplate!!.dataSource.connection)
        return query.queriesList("select * from book")
    }

    //override to string
    override fun toString() = Utility().reflectionToString(this)

}