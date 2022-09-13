package com.halil.loginscreenapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.halil.loginscreenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPreferences = getSharedPreferences("InformationUser", Context.MODE_PRIVATE)
        val sharedPreferencesUser = sharedPreferences.getString("userName", "")
        val sharedPreferencesPassword = sharedPreferences.getString("Password", "")

        binding.buttonLogin.setOnClickListener {
            if (sharedPreferencesUser == binding.editTextTextPersonName.text.toString() &&
                sharedPreferencesPassword == binding.SignupPassword.text.toString()
            ) {
                intent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please try again. Doesn't Match!!", Toast.LENGTH_SHORT).show()
            }

        }
        binding.signUp.setOnClickListener {
            intent = Intent(this@MainActivity, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}