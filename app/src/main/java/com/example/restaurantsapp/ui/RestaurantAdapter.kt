package com.example.restaurantsapp.ui

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.restaurantsapp.data.Restaurant
import com.example.restaurantsapp.databinding.RestaurantItemBinding

class RestaurantAdapter : List<Restaurant,RestaurantAdapter.RestaurantViewHolder>(RestaurantComparator()){


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