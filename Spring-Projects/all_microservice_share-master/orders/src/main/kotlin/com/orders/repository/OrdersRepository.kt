package com.orders.repository

import com.orders.models.Orders
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import javax.transaction.Transactional

@Repository
interface OrdersRepository: JpaRepository<Orders, Long>