package com.akirachix.ubora

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.ubora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView2.setOnClickListener {
            val intent = Intent(this,HomepgeActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            validateRegistration()
        }
        }
        fun validateRegistration() {
            clearErrors()
            var formError = false
            val firstName = binding.etFirstName.text.toString()
            if (firstName.isBlank()) {
                binding.tilFirstName.error ="First Name is required"
            }
            val lastName = binding.etLastName.text.toString()
            if (lastName.isBlank()) {
                formError = true
                binding.tilLastName.error = "Last Name is required"
            }
            val email = binding.etEmail.text.toString()
            if (email.isBlank()) {
                formError = true
                binding.etEmail.error = "Email is required"
            }
            val Password = binding.etPassword.text.toString()
            if (Password.isBlank()) {
                formError = true
                binding.tilPassword.error = "Password is required"
            }

            val ConfirmPassword = binding.etConfirmPassword.text.toString()
            if (ConfirmPassword.isBlank()) {
                formError = true
                binding.tilConfirmPassword.error = "Confirm password to proceed"
            }
            val SchoolName = binding.etSchoolName.text.toString()
            if (ConfirmPassword.isBlank()) {
                formError = true
                binding.tilShoolName.error = "School name is required"
            }

            if (Password != ConfirmPassword) {
                formError = true
                binding.tilConfirmPassword.error = "Password mismatch"
            }
            if (formError != true) {
            }
        }

        fun clearErrors() {
            binding.tilFirstName.error = null
            binding.tilLastName.error = null
            binding.tilEmail.error = null
            binding.tilShoolName.error = null
            binding.tilPassword.error = null
            binding.tilConfirmPassword.error = null


        }
    }
