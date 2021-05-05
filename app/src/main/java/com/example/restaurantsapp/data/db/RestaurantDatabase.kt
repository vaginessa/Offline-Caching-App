package com.example.restaurantsapp.data.db

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.restaurantsapp.data.Restaurant
import com.example.restaurantsapp.data.dao.RestaurantDao

@Database(entities = [Restaurant::class],version = 1)
abstract class RestaurantDatabase : RoomDatabase() {

    abstract fun restaurantDao(): RestaurantDao

    private fun buildDatabase(app:Application) = Room.databaseBuilder(app,
    RestaurantDatabase::class.java,"restaurant_database").build()


}