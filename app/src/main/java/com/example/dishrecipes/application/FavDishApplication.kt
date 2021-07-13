package com.example.dishrecipes.application

import android.app.Application
import com.example.dishrecipes.model.database.FavDishRepository
import com.example.dishrecipes.model.database.FavDishRoomDatabase

class FavDishApplication: Application() {

    private val database by lazy {
        FavDishRoomDatabase.getDatabase((this@FavDishApplication))
    }

    val repository by lazy {
        FavDishRepository(database.favDishDao())
    }

}