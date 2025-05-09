package com.example.dependencyinjection

import dagger.Component

@Component(modules = [MemoryCardModule::class, LithiumBatteryModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone() : SmartPhone
}