package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone : SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        DaggerSmartPhoneComponent.create().getSmartPhone().makeCallRecording()

        /*DaggerSmartPhoneComponent.create().injectMain(this)
        smartPhone.makeCallRecording()*/

        DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()
            .injectMain(this)

        /*val smartPhone = SmartPhone(Battery(), MemoryCard(), SIMCard(ServiceProvider()))
            .makeCallRecording()*/
    }
}