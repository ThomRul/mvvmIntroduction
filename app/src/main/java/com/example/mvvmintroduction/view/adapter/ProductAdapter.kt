package com.example.mvvmintroduction.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmintroduction.R
import com.example.mvvmintroduction.model.Product
import com.example.mvvmintroduction.view.viewHolder.ProductViewHolder

class ProductAdapter(val products: List<Product>) : RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_cell, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val data = this.products[position]
        holder.productTitle.text = data.name
        holder.productPrice.text = data.price.toString()
    }

    override fun getItemCount(): Int {
        return products.size
    }
}