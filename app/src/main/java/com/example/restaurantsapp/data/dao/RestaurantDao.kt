package com.example.restaurantsapp.data.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.restaurantsapp.data.Restaurant
import kotlinx.coroutines.flow.Flow

interface RestaurantDao {

    @Query("SELECT * FROM restaurants")
    fun getAllRestaurants():Flow<List<Restaurant>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertRestaurants(restaurants:List<Restaurant>)

    @Query("DELETE FROM restaurants")
    suspend fun deleteAllRestaurants()

}