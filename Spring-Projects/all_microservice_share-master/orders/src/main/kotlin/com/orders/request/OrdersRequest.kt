package com.orders.request

class OrdersRequest (
        var id: Long? = null,
        var isInCart: Boolean = false,
        var accountId: Int? = null
)