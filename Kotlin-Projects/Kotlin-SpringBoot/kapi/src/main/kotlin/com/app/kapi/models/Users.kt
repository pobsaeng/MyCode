package com.app.kapi.models

import java.util.*
import javax.persistence.*


@Entity
@Table
data class Users(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int,
        var first_name: String,
        var last_name: String,
        var created_date: Date,
        var is_admin: Integer,
        var user_name: String,
        var pass_word: String) {

}



