package com.category

import com.category.models.Category
import com.category.repository.CategoryRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class CategoryApplication {

//    @Bean
//    fun run(repository: CategoryRepository): CommandLineRunner {
//        return CommandLineRunner { args ->
//            println("CommandLineRunner!")
//
//            repository.save(Category(null, "Programming")) //การเขียนโปรแกรม
//            repository.save(Category(null, "Management")) //บริหาร
//            repository.save(Category(null, "Personal Development")) //การพัฒนาตนเอง
//            repository.save(Category(null, "Literature")) //วรรณกรรม
//            repository.save(Category(null, "General Knowledge")) //ความรู้ทั่วไป
//
//            repository.findAll().forEach(::println)
//        }
//    }
}

fun main(args: Array<String>) {
    runApplication<CategoryApplication>(*args)
}
