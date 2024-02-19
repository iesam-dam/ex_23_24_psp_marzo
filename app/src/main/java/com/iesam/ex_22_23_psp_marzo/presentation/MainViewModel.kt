package com.iesam.ex_22_23_psp_marzo.presentation

import androidx.lifecycle.ViewModel
import com.iesam.ex_22_23_psp_marzo.domain.GetAdoptionsUseCase

class MainViewModel(private val getAdoptions: GetAdoptionsUseCase) : ViewModel() {

    fun loadAdoptions() {
        //getAdoptions
    }

}