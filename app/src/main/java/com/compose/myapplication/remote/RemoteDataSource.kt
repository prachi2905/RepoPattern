package com.compose.myapplication.remote

import com.compose.myapplication.data.Recipes

internal interface RemoteDataSource {
    suspend fun requestRecipes(): Resource<Recipes>
}
