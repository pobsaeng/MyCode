package com.app.entities

data class DataBook(
    var id: Int,
    var title: String,
    var authors: String,
    var price: Double,
    var stock: Int = 0
)