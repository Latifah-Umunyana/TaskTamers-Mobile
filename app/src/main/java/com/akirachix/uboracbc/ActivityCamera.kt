package com.akirachix.uboracbc

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.uboracbc.databinding.ActivityCameraBinding
import com.akirachix.uboracbc.databinding.ActivityPracticalPageBinding

class ActivityCamera : AppCompatActivity() {
    lateinit var binding: ActivityCameraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
  var binding = ActivityCameraBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_camera)

        binding.ivCancel.setOnClickListener{
            val intent = Intent( this, PracticalPage::class.java)

            startActivity(intent)
        }

    }
}