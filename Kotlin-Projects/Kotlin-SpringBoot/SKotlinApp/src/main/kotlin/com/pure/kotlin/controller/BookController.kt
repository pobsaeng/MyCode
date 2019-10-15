package com.pure.kotlin.controller

import com.app.entities.Book
import com.pure.kotlin.databases.Queries
import com.pure.kotlin.entities.JdbcTemplateRepository
//import com.pure.kotlin.entities.JdbcTemplateRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.ArrayList
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import com.pure.kotlin.helper.Utility

@RestController
class BookController {
    @Autowired
    val jdbcTemplate: JdbcTemplate? = null

    @Autowired
    val jdbcTemplateRepository: JdbcTemplateRepository? = null

    @GetMapping("/initBook")
    fun initFun(): ArrayList<Book> {

        var query = Queries(jdbcTemplate!!.dataSource.connection)
        var listMap = query.queriesList("select * from book")

        var list = ArrayList<Book>()
        for(i in 1..listMap.size) {
            list.add(Utility().convertProp(i-1, listMap, Book()) as Book)
        }

        var qUser = Queries(jdbcTemplate!!.dataSource.connection)
        var users = qUser.queriesList("select * from users")
        for (i in users) print(i)

        return list
    }
}