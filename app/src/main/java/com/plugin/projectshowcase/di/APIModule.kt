package com.plugin.projectshowcase.di

import com.plugin.projectshowcase.data.api.ApiClient
import com.plugin.projectshowcase.data.utils.Constant.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class APIModule {

    @Provides
    @Singleton
    fun provideApi (builder : Retrofit.Builder) : ApiClient{
        return builder
            .build()
            .create(ApiClient::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit () : Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }


}