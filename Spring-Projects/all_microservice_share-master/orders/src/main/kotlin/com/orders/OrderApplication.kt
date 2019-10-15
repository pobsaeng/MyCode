package com.orders

import com.orders.models.Orders
import com.orders.repository.OrdersRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class OrdersApplication {

    @Bean
    fun run(repository: OrdersRepository): CommandLineRunner {
        return CommandLineRunner { args ->
            println("CommandLineRunner!")

//            repository.save(Orders(null, true, 70003017))
//            repository.save(Orders(null, true, 70003018))
            println("---------Orders----------")
            repository.findAll().forEach(::println)
//            println(repository.findById(1))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<OrdersApplication>(*args)
}
