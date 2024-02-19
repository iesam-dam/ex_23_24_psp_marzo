package com.iesam.ex_22_23_psp_marzo.domain

interface AdoptionRepository {
    fun getAdoptions(): List<Animal>
}