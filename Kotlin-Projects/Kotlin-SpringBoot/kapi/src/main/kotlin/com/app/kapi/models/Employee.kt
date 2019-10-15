package com.app.kapi.models

import javax.persistence.*


@Entity
@Table
data class Employee(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int,
        var fullname: String,
        var address: String,
        var telephone: String) {

}



