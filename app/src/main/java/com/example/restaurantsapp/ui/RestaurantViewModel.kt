package com.example.restaurantsapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantsapp.api.RestaurantApi
import com.example.restaurantsapp.api.RestaurantApiImpl
import com.example.restaurantsapp.api.ServiceBuilder
import com.example.restaurantsapp.data.Restaurant
import kotlinx.coroutines.launch

class RestaurantViewModel(private val api:RestaurantApi)  : ViewModel(){

    private val restaurantsLiveData = MutableLiveData<List<Restaurant>>()

    init {
        viewModelScope.launch {
            val restaurants = api.getRestaurants()
            restaurantsLiveData.value = restaurants
        }
    }

}