package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {

    init {
        Log.i("MyTag", "Battery Constructed")
    }

    fun getPower() {
        Log.i("MyTag", "Battery Power Connected")
    }
}