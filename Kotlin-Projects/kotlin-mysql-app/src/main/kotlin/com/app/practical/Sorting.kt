package com.app.practical

import com.app.entities.Book

class Sorting {
    init {
        var book = Book()
        var listBook = book.findAllByBookList()

        //Sorting
        var sortById = listBook.sortedWith(compareBy { it.id }) //sorting by ascending
        var sortedDESC = listBook.sortedByDescending { it.id } //sorting by descending
        val sortedList = listBook.sortedWith(compareBy(Book::price, Book::stock, Book::title)) //sorting by object
        val sortedComparator = listBook.sortedWith(compareBy<Book> { it.id }.thenBy { it.title }.thenBy { it.authors }) //sorting by comparator


        for(i in 1..sortedComparator.size) {
            println(sortedComparator[i-1])
        }
    }
}