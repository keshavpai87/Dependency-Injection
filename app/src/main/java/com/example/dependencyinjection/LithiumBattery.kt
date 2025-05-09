package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

class LithiumBattery @Inject constructor() : Battery {
    override fun getPower() {
        Log.i("MyTag", "Power from Lithium Battery")
    }
}