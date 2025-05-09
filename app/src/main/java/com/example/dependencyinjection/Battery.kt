package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

interface Battery {

   /* init {
        Log.i("MyTag", "Battery Constructed")
    }

    fun getPower() {
        Log.i("MyTag", "Battery Power Connected")
    }*/

    // Making the method abstract to work on Dagger with interface
    fun getPower()
}