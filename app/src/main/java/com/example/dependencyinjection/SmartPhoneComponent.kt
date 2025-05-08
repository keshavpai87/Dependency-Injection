package com.example.dependencyinjection

import dagger.Component

@Component
interface SmartPhoneComponent {

    fun getSmartPhone() : SmartPhone
}