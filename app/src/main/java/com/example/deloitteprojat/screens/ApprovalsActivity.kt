package com.example.deloitteprojat.screens

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.deloitteprojat.R

class ApprovalsActivity : AppCompatActivity() {
    private lateinit var ivback: ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_approvals)

        ivback = findViewById(R.id.back)

        ivback.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

    }
}