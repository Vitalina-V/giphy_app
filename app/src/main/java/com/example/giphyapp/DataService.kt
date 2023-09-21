package com.example.giphyapp

import retrofit2.http.GET

interface DataService {
    @GET("gifs/trending?api_key=MfablKNSJoz3W9CN5Vgq4049BkSSXIED")

    fun getGifs(): retrofit2.Call<DataResult>
}
