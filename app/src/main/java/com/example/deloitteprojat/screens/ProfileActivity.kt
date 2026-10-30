package com.example.deloitteprojat.screens

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.deloitteprojat.MainActivity
import com.example.deloitteprojat.R

class ProfileActivity : AppCompatActivity() {
    private lateinit var ivBack: ImageView
    private lateinit var passwordchange: LinearLayout
    private lateinit var logout: LinearLayout
    private lateinit var privacy: LinearLayout
    private lateinit var terms: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)



         passwordchange = findViewById(R.id.password)
         privacy = findViewById(R.id.privaccy)
         logout = findViewById(R.id.logout)
         terms = findViewById(R.id.terms)
        ivBack = findViewById(R.id.btnBack)

        ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        passwordchange.setOnClickListener {
            startActivity(Intent(this, PasswordActivity::class.java))

        }
        logout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
        privacy.setOnClickListener {
            startActivity(Intent(this, PrivasyActivity::class.java))

        }


    }


}