package com.orderdetails.controllers

import com.orderdetails.models.OrderDetails
import com.orderdetails.repository.OrderDetailsRepository
import com.orderdetails.request.OrderDetailsRequest
import org.springframework.web.bind.annotation.*

@RestController
class OrderDetailsController (val repository: OrderDetailsRepository) {

    @PostMapping("/create")
    fun create(@RequestBody orderDetailsRequest: OrderDetailsRequest): OrderDetails {
        val orderDetails = OrderDetails(
            orderDetailsRequest.id,
            orderDetailsRequest.bookId,
            orderDetailsRequest.quantity
        )
        return repository.save(orderDetails)
    }

//    @PostMapping("/findBookInCart")
//    fun findBookInCart(@RequestParam orderId: Int, @RequestParam bookId: Int) = repository.getBookInCart(orderId, bookId)

    @GetMapping("/findBookInCart/{orderId}/{bookId}")
    fun findBookInCart(@PathVariable orderId: Int, @PathVariable bookId: Int) = repository.getBookInCart(orderId, bookId)


    @GetMapping("/findAllOrderDetail")
    fun findAllOrderDetail() = repository.findAll()

    @GetMapping("/findByOrderDetailId/{id}")
    fun findByOrderDetailId(@PathVariable id: Long) = repository.findById(id)
}