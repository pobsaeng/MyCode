package com.category.models;

import javax.persistence.*

@Entity
@Table
data class Category (
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        val id: Long? = null,
        val categoryname: String? = ""
)