package app.protonwallet.src.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var retrofit: Retrofit = Retrofit.Builder()
    .baseUrl("http://193.178.170.251:5000/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

var apiService: ApiService = retrofit.create(ApiService::class.java)
