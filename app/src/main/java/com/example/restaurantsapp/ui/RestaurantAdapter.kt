package com.example.restaurantsapp.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.restaurantsapp.data.Restaurant
import com.example.restaurantsapp.databinding.RestaurantItemBinding

class RestaurantAdapter :
    ListAdapter<Restaurant, RestaurantAdapter.RestaurantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val binding = Restaurant
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class RestaurantViewHolder(private val binding:RestaurantItemBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(restaurant: Restaurant){
            binding.apply {
                Glide.with(itemView)
                    .load(restaurant.logo)
                    .into(imageViewLogo)

                textViewName.text = restaurant.name
                textViewAddress.text = restaurant.address
                textViewType.text = restaurant.type
            }
        }
    }
}