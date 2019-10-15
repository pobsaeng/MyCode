package com.app.kapi.controllers

import com.app.kapi.models.Users
import com.app.kapi.repository.UsersRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class UsersController(val usersRepository: UsersRepository) {

    @GetMapping("/findAllUsers")
    @ResponseBody
    fun getAllUsers(): MutableList<Users> {
//        var usersRepo = usersRepository.findAll()
        return usersRepository.findAll()
    }

//    @PostMapping("/user/signin")
//    @ResponseBody
//    fun signIn(): Any {
//        var usersRepo = usersRepository.findAll()
//                .stream()
//                .map({ it })
//                .filter { it.first_name.equals("") }
//                .collect(Collectors.toList())
//
//        return usersRepository.findAll()
//    }

    @PostMapping("/user/register")
    fun register(@RequestBody user: Users): ResponseEntity<*> { // You should hash users' passwords
//        if (usersRepository.findByUsername(user.user_name) != null) {
//            return ResponseEntity("user existed", HttpStatus.CONFLICT)
//        }
        var u = Users(
                user.id,
                user.first_name,
                user.last_name,
                user.created_date,
                user.is_admin,
                user.user_name,
                user.pass_word)
        usersRepository.save(u)

        return ResponseEntity.ok("created")
    }
}