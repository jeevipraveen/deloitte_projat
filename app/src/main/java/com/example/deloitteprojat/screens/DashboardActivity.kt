package com.example.deloitteprojat.screens

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.deloitteprojat.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var imgNotification: ImageView
    private lateinit var letftmenu: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        initViews()
        clickListeners()
        imgNotification = findViewById(R.id.imgNotification)
        letftmenu = findViewById(R.id.imgMenu)

        imgNotification.setOnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
            true

        }
        letftmenu.setOnClickListener {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()

//            startActivity(Intent(this, NotificationActivity::class.java))
//            true

        }
    }

    private fun initViews() {
        bottomNavigation = findViewById(R.id.bottomNavigation)
    }

    private fun clickListeners() {

        bottomNavigation.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.nav_home -> {
                    true
                }

                R.id.nav_customer -> {
                     startActivity(Intent(this, customer360Activity::class.java))
                    true
                }

                R.id.nav_lead -> {
                    startActivity(Intent(this, ActivityTaskActivity::class.java))
                    true
                }

                R.id.nav_service -> {
                    startActivity(Intent(this, ServiceQulaityActivity::class.java))
                    true
                }

                R.id.nav_more -> {
                     startActivity(Intent(this, MoreMenuActivity::class.java))
                    true
                }

                else -> false
            }
        }
    }
}