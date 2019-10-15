package com.app.kapi.controllers

import com.app.kapi.models.Employee
import com.app.kapi.repository.EmployeeRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class EmployeeController(val employeeRepository: EmployeeRepository) {
    @GetMapping("/findallEmployee")
    @ResponseBody
    fun getEmployee(): MutableList<Employee> {
        return employeeRepository!!.findAll()
    }
}