package com.example.restaurantsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.restaurantsapp.R
import com.example.restaurantsapp.databinding.ActivityRestaurantBinding

class RestaurantActivity : AppCompatActivity() {

    private val  viewModel:RestaurantViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRestaurantBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_restaurant)

        val restaurantAdapter = RestaurantAdapter()

        binding.apply {
            recyclerView.apply {
                adapter = restaurantAdapter
                layoutManager = LinearLayoutManager(this@RestaurantActivity)
            }

            viewModel.restaurants.observe(this@RestaurantActivity){restaurants ->
                restaurantAdapter.submitList(restaurants)

            }
        }
    }
}