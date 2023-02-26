package com.iesam.ex_22_23_psp_marzo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.iesam.ex_22_23_psp_marzo.R
import com.iesam.ex_22_23_psp_marzo.data.AdoptionDataRepository
import com.iesam.ex_22_23_psp_marzo.data.local.AdoptionsLocalDataSource
import com.iesam.ex_22_23_psp_marzo.data.remote.AdoptionRemoteDataSource
import com.iesam.ex_22_23_psp_marzo.domain.GetAdoptionUseCase
import com.iesam.ex_22_23_psp_marzo.domain.GetAdoptionsUseCase

class MainActivity : AppCompatActivity() {

    private val repository = AdoptionDataRepository(
        AdoptionsLocalDataSource(this),
        AdoptionRemoteDataSource()
    )

    //Añadir aquí los objetos necesarios. Ejercicio 1.
    private val viewModel = MainViewModel(
        GetAdoptionsUseCase(repository),
        GetAdoptionUseCase(repository)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupObservers()
    }

    override fun onResume() {
        super.onResume()
        initAdoptionFlow()
        initAdoptions()
    }

    private fun setupObservers() {
        val state = Observer<MainViewModel.UiState> {
            it.animalList?.map { animal ->
                Log.d("@dev-ejer01", "$animal")
            }
            it.animal?.let { animal ->
                Log.d("@dev-ejer02", "$animal")
            }
        }
        viewModel.uiState.observe(this, state)
    }

    private fun initAdoptions() {
        viewModel.loadAdoptions()
    }

    private fun initAdoptionFlow() {
        viewModel.loadAdoption()
    }
}