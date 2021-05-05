package com.example.android.funfacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.android.funfacts.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private var binding: ActivityLoginBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        login()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun login() {

        val loginButton = binding?.loginBtn

        loginButton?.setOnClickListener {

            val email = binding?.emailTextInput?.editText?.text.toString()
            val password = binding?.passwordTextInput?.editText?.text.toString()

            if ((email == AUTHORISED_EMAIL) && (password == AUTHORISED_PASSWORD)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Wrong email or password", Toast.LENGTH_SHORT).show()
            }

        }

    }

    companion object {

        const val AUTHORISED_EMAIL = "bonafide@gmail.com"
        const val AUTHORISED_PASSWORD = "2021Adventure"

    }
}