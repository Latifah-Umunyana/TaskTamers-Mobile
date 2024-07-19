package com.akirachix.uboracbc

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.uboracbc.databinding.ActivityLoginPageBinding

class ActivityLoginPage : AppCompatActivity() {
    lateinit var binding: ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvLogIn.setOnClickListener {
    finish()
}
        binding.btnLogIn.setOnClickListener{
            validateRegistration()

        }

        binding.tvLogIn.setOnClickListener{
            val intent = Intent( this, PracticalPage::class.java)

            startActivity(intent)
        }

    }

    fun validateRegistration() {
        var formError = false
        val fullname = binding.etFullName.text.toString()
        if (fullname.isBlank()) {
            binding.tilFullName.error = "Full Name is required"
        }
        val password = binding.etPassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.tilPassword.error = "Password is required"
        }
        val confirmPassword = binding.etConfirmPassword.text.toString()
        if (confirmPassword.isBlank()) {
            formError = true
            binding.tilConfirmPassword.error = "Confirmation of password required"
        }
        fun clearErrors() {
            binding.tilFullName.error = null
            binding.tilPassword.error = null
            binding.tilConfirmPassword.error = null
        }
    }

}


