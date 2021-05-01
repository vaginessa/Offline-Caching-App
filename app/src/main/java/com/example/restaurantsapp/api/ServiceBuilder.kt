package com.example.restaurantsapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {

    fun createRetrofitService():ServiceBuilder {
        val retrofit = Retrofit.Builder()
            .baseUrl(RestaurantApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(ServiceBuilder::class.java)

    }

}