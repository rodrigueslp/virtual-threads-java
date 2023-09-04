package com.luizpaulo.virtualthreads.controller

import com.luizpaulo.virtualthreads.entity.Customer
import com.luizpaulo.virtualthreads.service.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController (
        val customerService: CustomerService
) {

    @GetMapping
    fun findAll() = customerService.findAll()

    @PostMapping
    fun create(@RequestBody customer: Customer) = customerService.create(customer)

    @GetMapping("/update")
    fun update() = customerService.updateCustomerNormal()

    @GetMapping("/updatevt")
    fun updateVT() = customerService.updateCustomerVT()

}