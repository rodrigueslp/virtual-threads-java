package com.luizpaulo.virtualthreads.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity(name = "customers")
class Customer(
        @Id @GeneratedValue var id: Long?,
        var name: String,
        var email: String,
        var uuid: String
)