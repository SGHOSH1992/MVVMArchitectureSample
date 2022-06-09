package com.example.mvvm_architecture_sample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.mvvm_architecture_sample.R

class SplashActivity : AppCompatActivity() {
    var isLoading : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            isLoading=false
        },5000)


        installSplashScreen().apply {
            setKeepOnScreenCondition{
                isLoading
            }
        }
        setContentView(R.layout.activity_splash)

    }
}