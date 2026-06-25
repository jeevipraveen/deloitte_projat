package com.example.deloitteprojat

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.deloitteprojat.screens.DashboardActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUserName = findViewById<TextInputEditText>(R.id.etUserName)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val btnLogin = findViewById<MaterialButton>(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val userName = etUserName.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (userName.isEmpty()) {
                etUserName.error = "Enter Username"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                etPassword.error = "Enter Password"
                return@setOnClickListener
            }

            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()

            // Navigate Dashboard
             startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}