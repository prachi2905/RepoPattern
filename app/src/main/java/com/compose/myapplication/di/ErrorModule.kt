package com.compose.myapplication.di
import com.compose.myapplication.data.error.mapper.ErrorMapper
import com.compose.myapplication.data.error.mapper.ErrorMapperSource
import com.compose.myapplication.data.errors.ErrorManager
import com.compose.myapplication.data.errors.ErrorUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// with @Module we Telling Dagger that, this is a Dagger module
@Module
@InstallIn(SingletonComponent::class)
abstract class ErrorModule {
    @Binds
    @Singleton
    abstract fun provideErrorFactoryImpl(errorManager: ErrorManager): ErrorUseCase

    @Binds
    @Singleton
    abstract fun provideErrorMapper(errorMapper: ErrorMapper): ErrorMapperSource
}