package com.iesam.ex_22_23_psp_marzo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iesam.ex_22_23_psp_marzo.domain.Animal
import com.iesam.ex_22_23_psp_marzo.domain.GetAdoptionsUseCase
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val getAdoptions: GetAdoptionsUseCase) : ViewModel() {

    private var _uiState = MutableLiveData<UiState>()
    val uiState : LiveData<UiState> = _uiState

    fun loadAdoptions() {
        _uiState.postValue(UiState(animals = emptyList()))
        viewModelScope.launch(Dispatchers.IO) {
            responseSucces(getAdoptions.invoke())
        }
    }
private fun responseSucces(animals: List<Animal>){
    _uiState.postValue(UiState(animals=animals))
}

data class UiState(
    val animals: List<Animal> = emptyList()
)
}