package com.iesam.ex_22_23_psp_marzo.data.remote

import retrofit2.Retrofit

class ApiBuilder {

     fun build(): ApiServices {
        var retrofit = Retrofit.Builder()
            .baseUrl("https://huellas.sitehub.es/api")
            .build()
        return retrofit.create(ApiServices::class.java)
    }

}