package com.aemo.apis.kotlinapi.controller

import com.aemo.apis.kotlinapi.model.Customer
import com.aemo.apis.kotlinapi.persistence.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController

@RequestMapping("/customers")

class CustomerController(val repository: CustomerRepository) {
    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addCustomer(@RequestBody customer: Customer) = repository.save(customer)

    @PutMapping("/{id}")
    fun updateCustomer(@PathVariable id: Long, @RequestBody customer: Customer) {
        assert(customer.id == id)
        repository.save(customer)
    }
}

