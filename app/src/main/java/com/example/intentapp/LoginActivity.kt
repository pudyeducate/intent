package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.intentapp.databinding.ActivityHomeBinding
import com.example.intentapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            logintoreg.setOnClickListener{
                val intent = Intent(this@LoginActivity,MainActivity::class.java)
                startActivity(intent)
            }
            buttonLog.setOnClickListener{view->
                val intent = Intent(this@LoginActivity,HomeActivity::class.java)
                startActivity(intent)
            }
        }

    }
}