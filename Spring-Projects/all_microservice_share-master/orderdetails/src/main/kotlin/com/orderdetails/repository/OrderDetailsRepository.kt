package com.orderdetails.repository

import com.orderdetails.models.OrderDetails
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@Repository
interface OrderDetailsRepository: JpaRepository<OrderDetails, Long> {
    @Query("SELECT o FROM OrderDetails o WHERE o.ordersId=:oId")
    fun getOrderDetails(@Param("oId") oId: Int): List<OrderDetails>

    @Query("SELECT o FROM OrderDetails o WHERE o.ordersId=:oId and o.bookId=:bId")
    fun getBookInCart(@Param("oId") oId: Int, @Param("bId") bId: Int): List<OrderDetails>
}