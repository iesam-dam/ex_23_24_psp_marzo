package com.iesam.ex_22_23_psp_marzo.data.remote

import com.iesam.ex_22_23_psp_marzo.domain.Animal

class AdoptionRemoteDataSource(
    private val builder: ApiBuilder
) {
    private var endPoint = builder.build()
    fun getAdoptions(): List<Animal> {

        val animalsType = endPoint.listAnimalType().map {
            it.toDomain()
        }
        val animals = endPoint.listAnimal()

        val domainAnimals = emptyList<Animal>().toMutableList()

        for (i in animalsType) {
            domainAnimals += animals[i.id].toDomain(animalsType[i.id])
        }
        return domainAnimals
    }

}