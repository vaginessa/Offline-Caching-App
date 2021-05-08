package com.example.restaurantsapp.ui

import androidx.lifecycle.*
import com.example.restaurantsapp.api.RestaurantApi
import com.example.restaurantsapp.data.Restaurant
import com.example.restaurantsapp.data.repository.RestaurantRepository
import kotlinx.coroutines.launch

class RestaurantViewModel(private val repository: RestaurantRepository)  : ViewModel(){

    val restaurants = repository.getRestaurants().asLiveData()
    }

