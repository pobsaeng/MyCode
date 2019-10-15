package com.app.practical

import com.app.database.Queries
import com.app.entities.Book
import com.app.database.Connector

class Loop {
    init {
        var query = Queries(Connector().getCT("kotlindb"))
        var listMap = query.queriesList("select * from book")

        var j = 0
        do {
            for ((k, v) in listMap[j++]) println("$k, $v")

        } while (j < listMap.size)

        println("---------------------------------------")

//        var it = listMap.iterator()
//        while (it.hasNext()) {
//            it.next().forEach { t, u -> println("$t, $u") }
//        }
//
//
//        for (v in 1..listMap.size) {
//
//            for ((key, value) in listMap[v - 1]) {
//                println("$key = $value")
//            }
//
//
//            listMap[v - 1].forEach { (key, value) ->
//                println("$key = $value")
//            }
//
//            println("------------------------------------")
//        }
//
//
//        var i = 0;
//        while (i < listMap.size) {
//            println("$i, ${listMap[i++]}")
//        }
//        println("----------------------------")
//        var b = 0
//        do {
//            println("$b, ${listMap[b++]}")
//        } while (b < listMap.size)
//
//
//        var listData = Queries(Connector().getCT("kotlindb"))
//            .queriesList("select * from book")
//
//        for (i in 1..listData.size) {
//            println("$i, ${listData[i - 1]}")
//        }
//
//        println("--------------------------------------------------")
//
//        for ((i, item) in listData.withIndex()) {
//            println("$i, $item")
//        }
//
//        println("--------------------------------------------------")
//        var listT = Queries(Connector().getCT("hirepurchase"))
//            .queriesList("select * from product")
//
//        listT.forEachIndexed { index, element ->
//            println("$index, $element")
//        }
//
//        println("--------------------------------------------------")
//
//        for (e in listData.iterator()) {
//            println(e)
//        }
//
//        println("--------------------------------------------------")
//
//        var it = listData.iterator()
//        var i = 0
//        while (it.hasNext()) {
//            i++
//
//            println("$i, ${it.next()}")
//        }
//
//        println("-------------------------Last Loop-------------------------")
//        for (i in 1..listData.size step 2) {
//            println("$i, ${listData[i - 1]}")
//        }
    }
}