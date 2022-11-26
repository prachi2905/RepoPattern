package com.compose.myapplication.remote.service

import com.compose.myapplication.BuildConfig
import com.compose.myapplication.data.Recipes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface RecipesService {
    @GET("/planetary/apod?")
    suspend fun fetchRecipes(
        @Query("page") page: Int = 20,
    ): Response<Recipes>
}
