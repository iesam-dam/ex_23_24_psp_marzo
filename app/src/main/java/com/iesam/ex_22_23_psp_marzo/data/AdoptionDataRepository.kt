package com.iesam.ex_22_23_psp_marzo.data

import com.iesam.ex_22_23_psp_marzo.data.local.AdoptionsLocalDataSource
import com.iesam.ex_22_23_psp_marzo.data.remote.AdoptionRemoteDataSource
import com.iesam.ex_22_23_psp_marzo.domain.AdoptionRepository
import com.iesam.ex_22_23_psp_marzo.domain.Animal

class AdoptionDataRepository(
    private val localDataSource: AdoptionsLocalDataSource,
    private val remoteDataSource: AdoptionRemoteDataSource
) :
    AdoptionRepository {


    override fun getAdoptions(): List<Animal> {
        return remoteDataSource.getAdoptions().also {
            // Ejercicio 2. Descomentar.
            // localDataSource.saveAnimal(it[0])
        }
    }

    override fun getAdoption(): Animal {
        //Ejercicio 2. Descomentar.
        //return localDataSource.getAnimal()
        TODO()
    }
}