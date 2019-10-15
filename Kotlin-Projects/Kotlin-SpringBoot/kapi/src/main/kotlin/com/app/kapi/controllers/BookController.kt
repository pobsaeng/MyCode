package com.app.kapi.controllers

import com.app.kapi.models.Book
import com.app.kapi.repository.BookRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class BookController(val bookRepository: BookRepository) {
    @GetMapping("/findAllBook")
    @ResponseBody
    fun getAllBook(): MutableList<Book> {
        return bookRepository.findAll()
    }
}