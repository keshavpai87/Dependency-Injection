package com.example.dependencyinjection

import android.util.Log

class MemoryCard {

    init {
        Log.i("MyTag", "Memory Card Constructed")
    }

    fun getSpaceAvailability() {
        Log.i("MyTag", "Memory Space Available")
    }
}