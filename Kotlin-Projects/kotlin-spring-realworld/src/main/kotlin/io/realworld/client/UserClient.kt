package io.realworld.client

import feign.Headers
import feign.RequestLine
import io.realworld.client.response.InLogin
import io.realworld.client.response.InRegister
import io.realworld.model.User

@Headers("Content-Type: application/json")
interface UserClient {
    @RequestLine("POST /api/users/login")
    fun login(login: InLogin): OutUser

    @RequestLine("POST /api/users")
    fun register(register: InRegister): OutUser
}


data class OutUser(var user: User = User())