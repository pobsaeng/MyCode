package com.category.controllers

import com.category.models.Category
import com.category.repository.CategoryRepository
import com.category.request.CategoryRequest
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class CategoryController (val repository: CategoryRepository) {

    @PostMapping("/create")
    fun save(@RequestBody bookRequest: CategoryRequest) {
        repository.save(Category(null, "Programming"))
            repository.save(Category(null, "Management"))
            repository.save(Category(null, "Personal Development"))
            repository.save(Category(null, "Literature"))
            repository.save(Category(null, "General Knowledge"))
    }

    @GetMapping("/findAllCategory")
    fun findAllCategory() = repository.findAll()

    @GetMapping("/findByCategoryId/{id}")
    fun findByCategoryId(@PathVariable id: Long) = repository.findById(id)

}