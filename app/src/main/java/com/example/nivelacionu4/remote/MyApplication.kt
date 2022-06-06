package com.example.nivelacionu4.remote

import android.app.Application

class MyApplication: Application() {

    override fun onCreate() {
        DatabaseManager.instance.initializeDb(applicationContext)
        super.onCreate()
    }

}