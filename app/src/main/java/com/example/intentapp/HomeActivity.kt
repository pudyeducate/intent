package com.example.intentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.intentapp.databinding.ActivityHomeBinding
import com.example.intentapp.databinding.ActivityMainBinding
import kotlin.math.log

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(MainActivity.USERNAME)
        val email2 = intent.getStringExtra(MainActivity.EMAIL)
        val phones = intent.getStringExtra(MainActivity.PHONE)
        Log.d("TAG",phones.toString())
        with(binding){
            username.text=name
            email.text=email2
            phone.text=phones
        }

    }
}