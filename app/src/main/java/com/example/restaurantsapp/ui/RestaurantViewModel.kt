package com.example.restaurantsapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantsapp.api.RestaurantApi
import com.example.restaurantsapp.api.ServiceBuilder
import com.example.restaurantsapp.data.Restaurant
import kotlinx.coroutines.launch

class RestaurantViewModel  : ViewModel(){
    private val api = RestaurantApi.GR
    private val restaurantsLiveData = MutableLiveData<List<Restaurant>>()


    init {
        viewModelScope.launch {
            val restaurants = api.
            restaurantsLiveData.value = restaurants
        }
    }


}