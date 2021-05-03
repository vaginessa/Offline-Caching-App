package com.example.restaurantsapp.api

import com.example.restaurantsapp.data.Restaurant
import retrofit2.http.GET

interface RestaurantApi {

    @GET("restaurant/random_restaurant?size=20")
    suspend fun getRestaurants():List<Restaurant>


}