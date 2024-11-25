package com.example.mvvmintroduction

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmintroduction.model.Product
import com.example.mvvmintroduction.view.adapter.ProductAdapter
import com.example.mvvmintroduction.viewModel.ProductViewModel

class MainActivity : AppCompatActivity() {
    lateinit var productRv : RecyclerView
    lateinit var productAdapter: ProductAdapter

    //référence du viewModel
    private var productViewModel = ProductViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialiser la RecyclerView
        this.productRv = findViewById(R.id.product_list)

        //on va observer les modification qui sont sur le viewModel( productViewModel)
        //il va nous envoyer des évènements qui sont de type list product
        // on va avoir une lambda qui va nous renvoyer une liste de produits
        // et on s'abonne avec .observe
        this.productViewModel.products.observe(this){
                products ->
            //on fois qu'on a la liste de produit on va faire un setup du recyclerview avec les produits
            this.setupRecyclerView(products)
        }

        //ensuite on appelle la fonction qui va modifier ou inserer un nouvel évènement dans la queue des event de l'observable
        this.productViewModel.loadProducts()

    }
    private fun setupRecyclerView(products : List<Product>){
        this.productAdapter = ProductAdapter(products)
        this.productRv.layoutManager = LinearLayoutManager(this)
        this.productRv.adapter = this.productAdapter

    }
}
