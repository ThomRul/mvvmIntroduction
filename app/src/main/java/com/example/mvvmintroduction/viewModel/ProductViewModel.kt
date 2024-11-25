package com.example.mvvmintroduction.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmintroduction.model.Product
import com.example.mvvmintroduction.repository.ProductRepositoy

class ProductViewModel : ViewModel() {
    private val productRepository = ProductRepositoy()

    // des observables pour notifier la vue

    private val _products = MutableLiveData<List<Product>>()
    val products : LiveData<List<Product>> get() = _products


    fun loadProducts() {
        val productData = productRepository.getProduct()
        this._products.value = productData
    }
}