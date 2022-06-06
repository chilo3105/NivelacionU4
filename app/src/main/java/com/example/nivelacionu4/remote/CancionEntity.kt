package com.example.nivelacionu4.remote

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//TODO add TABLE_USERS constant
@Entity(tableName = TABLE_PRODUCTS)
data class CancionEntity(
    val album: String,
    val nombre: String,
    val artista: String,
    val ano: String,
    val genero: String,
    val duracion : String,
    val noPista : Int
)

fun CancionEntity.toCancion() = Cancion(
    album,
    nombre,
    artista,
    ano,
    genero,
    duracion,
    noPista
)