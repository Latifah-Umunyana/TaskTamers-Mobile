package com.akirachix.uboracbc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.uboracbc.databinding.ActivityPracticalPageBinding

class PracticalPage : AppCompatActivity() {
    lateinit var binding: ActivityPracticalPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticalPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvPracticals.layoutManager = LinearLayoutManager(this)

        binding.PrevBtnPracticals.setOnClickListener{
            val intent = Intent( this, ActivityCamera::class.java)

            startActivity(intent)
        }

        displayPractical()

    }

    fun displayPractical(){

        val practical1 = Practical("Knitting","","Scarf","Modelling","","House")
        val practical2 = Practical("Environment","","tree","Cooking","","Githeri")
        val practical3 = Practical("Agriculture","","bean","Art & Craft","","cow")
        val practical4 = Practical("Environment","","irrigation","Cooking","","Rice")

        val practicalList = listOf(practical1,practical2,practical3,practical4)
        val practicalAdapter = PracticalAdapter(practicalList)
        binding.rvPracticals.adapter = practicalAdapter
    }

}