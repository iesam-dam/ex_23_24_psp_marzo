package com.iesam.ex_22_23_psp_marzo.domain

data class Animal(
    val id: Int,
    val name: String,
    val description: String,
    val breed: String,
    val sex: String,
    val dateBorn: String,
    val size: String,
    val urlImage: String,
    val type: AnimalType,
    val gallery: List<String>,
    val shortDescription: String,
    val urlSource: String
)

data class AnimalType(
    val id: Int,
    val name: String
)