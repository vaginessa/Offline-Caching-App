package com.example.restaurantsapp.data.repository

import androidx.room.withTransaction
import com.example.restaurantsapp.api.RestaurantApi
import com.example.restaurantsapp.data.db.RestaurantDatabase
import com.example.restaurantsapp.util.networkBoundResource
import kotlinx.coroutines.delay

class RestaurantRepository(private val api:RestaurantApi,private val db:RestaurantDatabase) {
    private val restaurantDao = db.restaurantDao()

    fun getRestaurants() = networkBoundResource(
        query = {
            restaurantDao.getAllRestaurants()
        },
        fetch = {
            delay(2000)
            api.getRestaurants()
        },
        saveFetchResult = { restaurants ->
            db.withTransaction {
                restaurantDao.deleteAllRestaurants()
                restaurantDao.insertRestaurants(restaurants)
            }

        }
    )

}