package com.plugin.projectshowcase.di

import com.plugin.projectshowcase.data.api.ShowcaseAPI
import com.plugin.projectshowcase.data.util.Constant.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ShowcaseApiModule {

    @Provides
    @Singleton
    fun provideApi (builder : Retrofit.Builder) : ShowcaseAPI {
        return builder
            .build()
            .create(ShowcaseAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit () : Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }
}