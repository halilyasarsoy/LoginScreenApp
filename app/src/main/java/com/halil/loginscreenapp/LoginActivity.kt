package com.halil.loginscreenapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.halil.loginscreenapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("InformationUser", Context.MODE_PRIVATE)
        val sharedPreferencesUserName = sharedPreferences.getString("userName", "")
        val sharedPreferencesPassword = sharedPreferences.getString("Password" ,"")

        binding.apply {
            personInfo.text = " User Name : $sharedPreferencesUserName"
            personPassword.text = " Password : $sharedPreferencesPassword"

        }
        binding.buttonLogout.setOnClickListener {
            intent = Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

}