package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider : ServiceProvider) {

    init {
        Log.i("MyTag", "Sim Card Constructed")
    }

    fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}