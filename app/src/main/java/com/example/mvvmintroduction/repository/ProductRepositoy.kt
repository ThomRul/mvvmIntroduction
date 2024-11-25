package com.example.mvvmintroduction.repository

import com.example.mvvmintroduction.model.Product

class ProductRepositoy {
    fun getProduct(): List<Product> {
        return listOf(
            Product(1, "Product 1", 10.0),
            Product(2, "Product 2", 12.1),
            Product(3, "Product 3", 15.6)
        )
    }
}