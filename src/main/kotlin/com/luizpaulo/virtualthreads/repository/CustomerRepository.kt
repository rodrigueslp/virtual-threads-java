package com.luizpaulo.virtualthreads.repository

import com.luizpaulo.virtualthreads.entity.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {
}