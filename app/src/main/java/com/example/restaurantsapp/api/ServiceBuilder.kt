package com.example.restaurantsapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    private const val BASE_URL = "https://random-data-api.com/api/"
    fun createRetrofitService():ServiceBuilder {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(ServiceBuilder::class.java)

    }

}