package com.iesam.ex_22_23_psp_marzo.data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.google.gson.Gson
import com.iesam.ex_22_23_psp_marzo.domain.Animal
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "adoptions")

class AdoptionsLocalDataSource(private val context: Context) {

    private val adoptionsKey = stringPreferencesKey("adoptions_key")

    fun getAnimal(): Flow<Animal> {
        return context.dataStore.data
            .map { preferences ->
                Gson().fromJson(preferences[adoptionsKey], Animal::class.java)
            }
    }

    suspend fun saveAnimal(animal: Animal) {
        context.dataStore.edit { settings ->
            settings[adoptionsKey] = Gson().toJson(animal, Animal::class.java)
        }
    }

}