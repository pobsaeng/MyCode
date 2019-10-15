package com.app.kapi

import com.app.kapi.repository.BookRepository
import com.app.kapi.repository.EmployeeRepository
import com.app.kapi.repository.UsersRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.jdbc.core.JdbcTemplate

@SpringBootApplication
@ComponentScan
class KapiApplication() {
    @Bean
    fun run(
            jdbcTemplate: JdbcTemplate,
            employeeRepository: EmployeeRepository,
            bookRepository: BookRepository,
            usersRepository: UsersRepository
    ): CommandLineRunner {

        return CommandLineRunner { args ->
            println("CommandLineRunner!")

//            employeeRepository.findAll().forEach(::println)
//            bookRepository.findAll().forEach(::println)

            println(usersRepository.findAll())

        }
    }
}

fun main(args: Array<String>) {
    runApplication<KapiApplication>(*args)
}

