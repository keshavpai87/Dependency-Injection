package com.example.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class LithiumBatteryModule {

    /*@Provides
    // This is not required here as we already have injected the LithiumBattery constructor
    fun providesLithiumBattery() : Battery {
        return LithiumBattery()
    }*/

    @Provides
    fun providesLithiumBattery(lithiumBattery: LithiumBattery) : Battery {
        return lithiumBattery
    }
}