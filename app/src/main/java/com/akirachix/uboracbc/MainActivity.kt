package com.akirachix.uboracbc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akirachix.uboracbc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFinish.setOnClickListener{
            val intent = Intent( this, PracticalPage::class.java)

            startActivity(intent)
        }

        binding.ivRightArrow.setOnClickListener{
            val intent = Intent( this, ActivityLoginPage::class.java)

            startActivity(intent)
        }
    }
}