package com.example.deloitteprojat.screens

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.deloitteprojat.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class DashboardActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var imgNotification: ImageView
    private lateinit var letftmenu: ImageView

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        initViews()
        clickListeners()



        imgNotification.setOnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
            true

        }
        letftmenu.setOnClickListener {

            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }


    }

    private fun initViews() {


            bottomNavigation = findViewById(R.id.bottomNavigation)

            imgNotification = findViewById(R.id.imgNotification)
            letftmenu = findViewById(R.id.imgMenu)

            drawerLayout = findViewById(R.id.drawerLayout)
            navigationView = findViewById(R.id.navigationView)

    }

    private fun clickListeners() {


        navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.nav_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                }

                R.id.nav_settings -> {
                    startActivity(Intent(this, SettingActivity::class.java))
//                    Toast.makeText(this, " Coming Soon Settings", Toast.LENGTH_SHORT).show()
                }

                R.id.nav_help -> {
                    startActivity(Intent(this, HelpActivity::class.java))
//                    Toast.makeText(this, " Coming Soon Help", Toast.LENGTH_SHORT).show()
                }

                R.id.nav_logout -> {
                    finish()
                }
            }

            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
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


    override fun onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}