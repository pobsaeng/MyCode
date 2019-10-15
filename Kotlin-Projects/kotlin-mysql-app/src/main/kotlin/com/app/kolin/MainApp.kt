package com.app.kolin

import com.app.entities.Book
import com.app.entities.DataBook
import com.app.practical.HashMapFiltering
import com.app.practical.Sorting
import java.util.stream.Collectors
import java.util.Comparator
import java.util.stream.Collector
import java.util.stream.Stream
import kotlin.streams.toList


fun main() {

//    var dbook = DataBook(1, "Java", "Pob", 100.0, 20)
//    var copyObj = dbook.copy()
//    println(dbook == copyObj) //is true
//    println(dbook === copyObj) //is false
//    println(dbook.equals(copyObj)) //is true

//    newDbook.authors = "Jackson"

//    println(newDbook.toString())
//    println(dbook.toString())

//    Sorting()
//    HashMapFiltering()


    // Converting from hashMap to ArrayList

//    var book = Book()
//    var bookList = book.findAllByBookList()
//    println(bookList)

//    val names = bookList
//        .asSequence()
//        .filter { it.price > 350 && it.price < 400}
//        .map { it }
//        .distinct()
//        .sortedBy { book -> book.id }
//        .toList()
//
//    var values : String = ""
//    for (i in names.withIndex()) println("$values")

    val arrayOfEmps = arrayOf<DataBook>(
        DataBook(30, "Java8", "Joe", 200.0, 20)
    )
    var dataBookList = Stream.of(arrayOfEmps).collect(Collectors.toList())

    println(arrayOfEmps)

//    val strings = Stream.of("how", "to", "do", "in", "java").collect(Collectors.toList())
//    println(strings)


//    val keyList = ArrayList(listMap[0].keys)
//    val valueList = ArrayList(listMap[0].values)
//    println("$keyList, $valueList")


}