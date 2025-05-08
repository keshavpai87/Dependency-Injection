package com.example.dependencyinjection

import dagger.Component

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    fun getSmartPhone() : SmartPhone
}