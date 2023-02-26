package com.iesam.ex_22_23_psp_marzo.domain

class GetAdoptionUseCase(private val adoptions: AdoptionRepository) {

    operator fun invoke(): Animal {
        return adoptions.getAdoption()
    }
}