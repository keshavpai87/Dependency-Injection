package com.example.dependencyinjection

import android.util.Log

class ServiceProvider {

    init {
        Log.i("MyTag", "Service Provider Constructed")
    }

    fun getServiceProvider() {
        Log.i("MyTag", "Service Provider Connected")
    }
}