package com.pure.kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @GetMapping("/initUser")
    fun initFun(): String {
        return "Hello UserController"
    }
}