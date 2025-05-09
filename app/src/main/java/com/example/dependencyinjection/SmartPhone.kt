package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject

//class SmartPhone @Inject constructor(val battery : Battery, val memoryCard : MemoryCard, val simCard : SIMCard) {
class SmartPhone @Inject constructor(val lithiumBattery: LithiumBattery, val memoryCard : MemoryCard, val simCard : SIMCard) {

    init {
//        battery.getPower()
        lithiumBattery.getPower()
        memoryCard.getSpaceAvailability()
        simCard.getConnection()
        Log.i("MyTag", "Smart Phone Constructed")
    }

    fun makeCallRecording() {
        Log.i("MyTag", "Calling...")
    }
}