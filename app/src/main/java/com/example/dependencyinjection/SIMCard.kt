package com.example.dependencyinjection

import android.util.Log

class SIMCard(val serviceProvider : ServiceProvider) {

    init {
        Log.i("MyTag", "Sim Card Constructed")
    }

    fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}