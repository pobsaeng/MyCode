package com.orderdetails.request

class OrderDetailsRequest (
        val id: Long? = null,
        val bookId: String? = "",
        val ordersId: Int? = null,
        val quantity: Int? = null
)