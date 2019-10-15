package com.app.practical

import com.app.entities.Book

class HashMapFiltering {
    init {
        var book = Book()
        var listMap = book.findAllByListMap()

        for (i in 1..listMap.size) {

            //There are 2 items with the value of the four hundred
            var isOK = listMap[i - 1].filterKeys { it == "price" }["price"]!!.equals(400)
            if (isOK) println("[${isOK}]") //true, true


            //It will be iterated through each item that only field name is 'title' and 'price'
            var item = listMap[i - 1].filterKeys { it == "title" || it == "price" }
            if (item.isNotEmpty()) {
                println("${item["title"]}, ${item["price"]}")
            }

            //Only filter the value equal to three hundred
            var element = listMap[i - 1].filterKeys { it == "price" }.filterValues { it == 300 }
            if (element.isNotEmpty())
                println(element)

        }

    }
}