package com.example.restaurantsapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantsapp.api.ServiceBuilder
import com.example.restaurantsapp.data.Restaurant
import kotlinx.coroutines.launch

class RestaurantViewModel : ViewModel() {
    private val api = ServiceBuilder
    private val restaurantsLiveData = MutableLiveData<List<Restaurant>>()
    init {
        viewModelScope.launch {
            val restaurants = api.createRetrofitService()
            restaurantsLiveData.value = restaurants
        }
    }

}