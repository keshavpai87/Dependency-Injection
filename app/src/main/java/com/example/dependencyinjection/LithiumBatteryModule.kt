package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class LithiumBatteryModule {

    /*@Provides
    // This is not required here as we already have injected the LithiumBattery constructor
    fun providesLithiumBattery() : Battery {
        return LithiumBattery()
    }*/

    /*// Without making the code concise, making use of the injection constructor
    @Provides
    fun providesLithiumBattery(lithiumBattery: LithiumBattery) : Battery {
        return lithiumBattery
    }*/

    // Making the code more concise
    @Binds
    abstract fun bindsLithiumBattery(lithiumBattery: LithiumBattery) : Battery

}