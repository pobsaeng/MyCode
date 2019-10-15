package com.app.kapi.models

import javax.persistence.*

@Entity
@Table
data class Book(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int,
        var title: String,
        var authors: String,
        var stock: Int,
        var price: Int
) {}