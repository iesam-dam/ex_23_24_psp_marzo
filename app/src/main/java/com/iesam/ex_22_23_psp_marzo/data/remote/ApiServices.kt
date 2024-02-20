package com.iesam.ex_22_23_psp_marzo.data.remote

import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {
    @GET("v1/adoptions.json")
    fun listAnimal(): List<AnimalRemoteModel>

    @GET("v1/adoptions.json")
    fun listAnimalType(): List<AnimalTypeRemoteModel>

}