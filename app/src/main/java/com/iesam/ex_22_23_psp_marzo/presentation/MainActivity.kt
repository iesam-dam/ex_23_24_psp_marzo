package com.iesam.ex_22_23_psp_marzo.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_psp_marzo.R
import com.iesam.ex_22_23_psp_marzo.data.AdoptionDataRepository
import com.iesam.ex_22_23_psp_marzo.data.remote.AdoptionRemoteDataSource
import com.iesam.ex_22_23_psp_marzo.data.remote.ApiBuilder
import com.iesam.ex_22_23_psp_marzo.domain.GetAdoptionsUseCase

class MainActivity : AppCompatActivity() {

    private val repository = AdoptionDataRepository(
        AdoptionRemoteDataSource(
            ApiBuilder()
        )
    )

    private val viewModel = MainViewModel(
        GetAdoptionsUseCase(repository)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupObservers()
    }

    override fun onResume() {
        super.onResume()
        initAdoptions()
    }

    private fun setupObservers() {
        //Ejercicio 1: Corutinas
    }

    private fun initAdoptions() {
        viewModel.loadAdoptions()
    }
}