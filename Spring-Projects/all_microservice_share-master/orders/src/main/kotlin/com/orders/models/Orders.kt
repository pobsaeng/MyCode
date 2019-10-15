package com.orders.models;

import javax.persistence.*
import javax.persistence.GenerationType
import javax.persistence.GeneratedValue

@Entity
@Table
data class Orders (
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        var id: Long? = null,
        var isInCart: Boolean = false,
        var accountId: Int? = null
)