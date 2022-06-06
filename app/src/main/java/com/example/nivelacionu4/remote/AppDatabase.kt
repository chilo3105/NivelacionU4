package com.example.nivelacionu4.remote

import androidx.room.Database
import androidx.room.RoomDatabase

const val DATABASE_VERSION = 1
const val TABLE_PRODUCTS = "canciones"
const val DATABASE_NAME = "appdata" +
        "base.sqlite"

@Database(entities = [CancionEntity::class],
    version = DATABASE_VERSION
)

abstract class AppDatabase : RoomDatabase(){
    abstract fun cancionDao(): CancionDao

}