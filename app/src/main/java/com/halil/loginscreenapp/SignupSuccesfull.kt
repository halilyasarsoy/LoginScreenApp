package com.halil.loginscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.halil.loginscreenapp.databinding.ActivitySignupSuccesfullBinding

class SignupSuccesfull : AppCompatActivity() {
    private lateinit var binding : ActivitySignupSuccesfullBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupSuccesfullBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.succesfullbacktomain.setOnClickListener {
            intent = Intent(this@SignupSuccesfull, MainActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}