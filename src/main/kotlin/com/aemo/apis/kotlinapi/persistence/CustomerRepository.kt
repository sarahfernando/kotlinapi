package com.aemo.apis.kotlinapi.persistence

import org.springframework.data.repository.CrudRepository

import com.aemo.apis.kotlinapi.model.Customer

interface CustomerRepository : CrudRepository<Customer, Long>
