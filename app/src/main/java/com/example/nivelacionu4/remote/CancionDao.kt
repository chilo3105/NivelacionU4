package com.example.nivelacionu4.remote

import androidx.room.*

@Dao
interface CancionDao {
    @Query("SELECT * FROM $TABLE_PRODUCTS")
    fun getCancionesFromDatabase(): List<CancionEntity>

    @Delete()
    fun delete(cancion: CancionEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(cancion: CancionEntity)
}