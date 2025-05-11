package com.example.dependencyinjection

import dagger.Component

@Component(modules = [MemoryCardModule::class, LithiumBatteryModule::class])
interface SmartPhoneComponent {
    /*
    * If we have 10 required dependencies like SmartPhone dependency, we may have to write getter
    * methods for all of them in the component interface. And you will have to call to them form all .
    * activities in this way. This will become more difficult if you have to pass values to those
    * dependencies at runtime. Hence commenting the getSmartPhone method
    * */
//    fun getSmartPhone() : SmartPhone

    fun injectMain(mainActivity: MainActivity)
}