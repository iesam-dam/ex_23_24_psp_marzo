package com.iesam.ex_22_23_psp_marzo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesam.ex_22_23_psp_marzo.domain.Animal
import com.iesam.ex_22_23_psp_marzo.domain.GetAdoptionUseCase
import com.iesam.ex_22_23_psp_marzo.domain.GetAdoptionsUseCase

class MainViewModel(
    private val getAdoptions: GetAdoptionsUseCase,
    private val getAdoption: GetAdoptionUseCase
) : ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState>
        get() = _uiState

    /**
     * Ejercicio 1.
     *  user _uiState.postValue(UiState(listado)) para mandar los datos a la UI.
     *  NO usar callback. No usar Thread.
     */
    fun loadAdoptions() {
        //getAdoptions
    }

    /**
     * Ejercicio 2.
     * Flow. Escuchamos cambios en local.
     * user _uiState.postValue(UiState(listado)) para mandar los datos a la UI.
     *  NO usar callback. No usar Thread.
     */
    fun loadAdoption() {
        //getAdoption
    }

    data class UiState(
        val animalList: List<Animal>? = null,
        val animal: Animal? = null
    )

}