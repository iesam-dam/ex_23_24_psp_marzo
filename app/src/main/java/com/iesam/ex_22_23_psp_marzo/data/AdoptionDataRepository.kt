package com.iesam.ex_22_23_psp_marzo.data

import com.iesam.ex_22_23_psp_marzo.data.remote.AdoptionRemoteDataSource
import com.iesam.ex_22_23_psp_marzo.domain.AdoptionRepository
import com.iesam.ex_22_23_psp_marzo.domain.Animal

class AdoptionDataRepository(private val remoteDataSource: AdoptionRemoteDataSource) :
    AdoptionRepository {


    override fun getAdoptions(): List<Animal> {
        return remoteDataSource.getAdoptions().apply {
            // Ejercicio 2. Descomentar.
        }
    }
}