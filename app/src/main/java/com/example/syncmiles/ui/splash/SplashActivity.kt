package com.example.syncmiles.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.syncmiles.R
import com.example.syncmiles.ui.welcome.WelcomeActivity

class SplashActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

            Handler().postDelayed({
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000)
        }

}