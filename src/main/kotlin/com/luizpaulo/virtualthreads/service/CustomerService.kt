package com.luizpaulo.virtualthreads.service

import com.luizpaulo.virtualthreads.entity.Customer
import com.luizpaulo.virtualthreads.repository.CustomerRepository
import org.springframework.stereotype.Service
import java.lang.Exception
import java.util.UUID
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

@Service
class CustomerService (
        val customerRepository: CustomerRepository
) {

    fun findAll() = customerRepository.findAll()

    fun create(customer: Customer) = customerRepository.save(customer)

    fun updateCustomerNormal() {
        val customer = customerRepository.findById(1L).get()
        customer.uuid = UUID.randomUUID().toString()
        customerRepository.save(customer)
    }

    fun updateCustomerVT() {
        try {
            val executorService: ExecutorService = Executors.newVirtualThreadPerTaskExecutor()
            executorService.submit {
                val customer = customerRepository.findById(1L).get()
                customer.uuid = UUID.randomUUID().toString()
                customerRepository.save(customer)
            }
        } catch (e: Exception) {
            print(e.message)
        }
    }

}