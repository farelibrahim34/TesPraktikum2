package com.example.tespraktikum.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



object ApiClient {
    const val BASE_URL = "https://67ac2a605853dfff53d98727.mockapi.io/"



    val instance :ApiInterface by lazy {
        val retrofit =Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiInterface::class.java)
    }



}