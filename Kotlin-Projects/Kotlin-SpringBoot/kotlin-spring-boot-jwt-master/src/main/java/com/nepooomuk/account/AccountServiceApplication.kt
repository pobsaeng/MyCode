package com.nepooomuk.account

import com.nepooomuk.account.utils.PasswordHashGenerator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories
@SpringBootApplication
open class AccountServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(AccountServiceApplication::class.java, *args)
}