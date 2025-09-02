package com.example.syncmiles

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import com.example.syncmiles.databinding.ActivityMainBinding
import androidx.navigation.ui.setupWithNavController
import com.example.syncmiles.ui.challenges.ChallengesFragment
import com.example.syncmiles.ui.history.HistoryFragment
import com.example.syncmiles.ui.home.HomeFragment
import com.example.syncmiles.ui.profile.ProfileFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get navController from NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        //Set up BottomNavigationView with navController
        binding.bottomNavigationView.setupWithNavController(navController)


    }
}