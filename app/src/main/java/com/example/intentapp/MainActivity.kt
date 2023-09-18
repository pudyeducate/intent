package com.example.intentapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import com.example.intentapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object{
        const val USERNAME = "USERNAME"
        const val EMAIL = "EMAIL"
        const val PHONE = "PHONE"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val fullText = resources.getString(R.string.login_to_reg)
        val spannable = SpannableString(fullText)
        val blueColor = Color.BLUE
        val startIndex = fullText.indexOf("Login")
        val endIndex = startIndex + "Login".length
        spannable.setSpan(ForegroundColorSpan(blueColor), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        with(binding){
            regtologin.text = spannable

            buttonLog.setOnClickListener{view->
                val intent = Intent(this@MainActivity,HomeActivity::class.java)
                intent.putExtra(EMAIL,emailField.text.toString())
                intent.putExtra(PHONE,phoneField.text.toString())
                intent.putExtra(USERNAME,usernameField.text.toString())
                startActivity(intent)
            }
            regtologin.setOnClickListener{
                val intent = Intent(this@MainActivity,LoginActivity::class.java)
                startActivity(intent)
            }
        }

        setContentView(binding.root)
    }
}