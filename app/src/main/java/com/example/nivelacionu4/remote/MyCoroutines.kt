package com.example.nivelacionu4.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MyCoroutines(private val cancionDao: CancionDao) {

    suspend fun save(cancion: Cancion) = withContext(Dispatchers.IO) {
        cancionDao.save(cancion.toEntity())
    }

    suspend fun delete(cancion: Cancion) = withContext(Dispatchers.IO) {
        cancionDao.delete(cancion.toEntity())
    }

    suspend fun getCanciones(): LiveData<List<Cancion>> = withContext(Dispatchers.IO) {
        return@withContext MutableLiveData(
            cancionDao.getCancionesFromDatabase().map { it.toCancion() })
    }

}