package com.example.dependencyinjection

import android.util.Log

class Battery {

    init {
        Log.i("MyTag", "Battery Constructed")
    }

    fun getPower() {
        Log.i("MyTag", "Battery Power Connected")
    }
}