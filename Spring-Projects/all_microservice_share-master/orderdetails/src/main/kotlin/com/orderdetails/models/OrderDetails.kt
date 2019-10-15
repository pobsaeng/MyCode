package com.orderdetails.models;

import javax.persistence.*

@Entity
@Table
data class OrderDetails (
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        val id: Long? = null,
        val bookId: String? = "",
        val ordersId: Int? = null,
        val quantity: Int? = null
)