package com.orderdetails

import com.orderdetails.repository.OrderDetailsRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class ProductsApplication {

    @Bean
    fun run(repository: OrderDetailsRepository): CommandLineRunner {
        return CommandLineRunner {
            println("CommandLineRunner!")

//            val book1 = Book(null, "Java 8")
//            repository.save(book1)
//
//            val book2 = Book()
//            book2.id = 1
//            book2.title = "Python"
//            book2.author = "Pob"
//            book2.description = "For Beginer"
//
//            repository.updateBook(
//                    book2.title,
//                    book2.description,
//                    book2.price,
//                    book2.year,
//                    book2.author,
//                    book2.isbn,
//                    book2.category_id,
//                    book2.id
//            )

            repository.findAll().forEach(::println)
//            println(repository.findById(1))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<ProductsApplication>(*args)
}
