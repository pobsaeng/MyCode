package com.pure.kotlin.entities

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import org.springframework.jdbc.core.RowMapper
import javax.sql.DataSource
import com.app.entities.Book

@Repository
open class JdbcTemplateRepository @Autowired constructor(dataSource: DataSource) {

    private val jdbcTemplate: JdbcTemplate

    init {
        this.jdbcTemplate = JdbcTemplate(dataSource)
    }

    open fun findAll(from: String) = jdbcTemplate.query("$from", RowMapper { rs, rowNum ->
        var book = Book()
        book.id = rs.getInt(1)
        book.title = rs.getString(2)
        book.authors = rs.getString(3)
        book.stock = rs.getInt(4)
        book.price = rs.getDouble(5)
    })

    private fun delete(from: String) = jdbcTemplate.update("DELETE FROM $from")

    open fun deleteMyTable() = delete("MY_TABLE")

}