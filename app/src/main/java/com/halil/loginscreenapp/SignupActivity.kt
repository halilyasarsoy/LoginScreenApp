package com.halil.loginscreenapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.halil.loginscreenapp.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSignup.setOnClickListener {

            val username = binding.SignupUsername.text.toString()
            val password = binding.SignupPassword.text.toString()
            val sharedPreferences = getSharedPreferences("InformationUser", Context.MODE_PRIVATE)
            val editör = sharedPreferences.edit()
            editör.putString("userName", username).apply()
            editör.putString("Password", password).apply()

            if (username.isNotEmpty() && password.isNotEmpty()) {

                val intent = Intent(this@SignupActivity, SignupSuccesfull::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(
                    this,
                    "Enter the information you want to register!",
                    Toast.LENGTH_SHORT
                ).show()
            }


        }



        binding.backToLogin.setOnClickListener {

            intent = Intent(this@SignupActivity, MainActivity::class.java)
            startActivity(intent)

        }
    }
}