package com.example.deloitteprojat.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.deloitteprojat.R

class customer360Activity : AppCompatActivity() {
    private lateinit var ivBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer360)

        ivBack = findViewById(R.id.ivBack)

        ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}