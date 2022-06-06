package com.example.nivelacionu4.remote

class Cancion (
                   album: String,
                   nombre: String,
                   artista: String,
                   ano: String,
                   genero: String,
                   duracion: String,
                   noPista : Int
) {

    val album: String = album
    val nombre: String = nombre
    val artista: String = artista
    val ano: String = ano
    val genero: String = genero
    val duracion: String = duracion
    val noPista : Int = noPista
}



fun Cancion.toEntity() = CancionEntity(
    album,
    nombre,
    artista,
    ano,
    genero,
    duracion,
    noPista
)