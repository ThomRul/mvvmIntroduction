package com.example.mvvmintroduction.view.viewHolder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmintroduction.R

class ProductViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val productTitle: TextView = itemView.findViewById(R.id.product_text_title)
    val productPrice: TextView = itemView.findViewById(R.id.product_text_price)
}