package com.example.deloitteprojat.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.deloitteprojat.R

class OppornityDetailsActivity : AppCompatActivity() {
    private lateinit var ivback: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oppornity_details)

        ivback = findViewById(R.id.ivBack)

        ivback.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}