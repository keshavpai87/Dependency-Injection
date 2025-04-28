package com.example.dependencyinjection

import android.util.Log

class SmartPhone(val battery : Battery, val memoryCard : MemoryCard, val simCard : SIMCard) {

    init {
        battery.getPower()
        memoryCard.getSpaceAvailability()
        simCard.getConnection()
        Log.i("MyTag", "Smart Phone Constructed")
    }

    fun makeCallRecording() {
        Log.i("MyTag", "Calling...")
    }
}