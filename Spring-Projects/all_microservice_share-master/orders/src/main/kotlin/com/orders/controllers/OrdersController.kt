package com.orders.controllers

import com.orders.repository.OrdersRepository
import com.orders.request.OrdersRequest
import org.springframework.web.bind.annotation.*
import com.orders.models.Orders



@RestController
class OrdersController (val repository: OrdersRepository) {

    @PostMapping("/create")
    fun create(@RequestBody ordersRequest: OrdersRequest): Orders {
        println("OrdersController create!!")

        val order = Orders()
        order.id = ordersRequest.id
        order.isInCart  = ordersRequest.isInCart
        order.accountId = ordersRequest.accountId

        return repository.save(order)
    }

    @GetMapping("/findAllOrder")
    fun findAllBook() = repository.findAll()

    @GetMapping("/findByOrderId/{id}")
    fun findByBookId(@PathVariable id: Long) = repository.findById(id)

}