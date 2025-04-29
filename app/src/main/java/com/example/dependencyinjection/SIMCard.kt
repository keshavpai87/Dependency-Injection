package com.example.dependencyinjection

import android.util.Log

class SIMCard() {

    // Field Injection
    lateinit var serviceProvider : ServiceProvider

    init {
        Log.i("MyTag", "Sim Card Constructed")
    }

    // Function Injection
    /*fun setServiceProvider(serviceProvider: ServiceProvider) {
        this.serviceProvider = serviceProvider
    }*/

    fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}