package com.example.dependencyinjection

import android.util.Log

class SIMCard() {

    private lateinit var serviceProvider : ServiceProvider

    init {
        Log.i("MyTag", "Sim Card Constructed")
    }

    fun setServiceProvider(serviceProvider: ServiceProvider) {
        this.serviceProvider = serviceProvider
    }

    fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}