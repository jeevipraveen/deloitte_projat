

package com.example.deloitteprojat.screens

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.deloitteprojat.R

class NotificationActivity : AppCompatActivity() {

    private lateinit var ivBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        ivBack = findViewById(R.id.ivBack)

        ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}