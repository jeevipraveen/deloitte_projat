package com.example.deloitteprojat.screens

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.deloitteprojat.R
import android.content.Intent
import android.widget.Toast
import com.example.deloitteprojat.adapters.MoreMenuAdapter
import com.example.deloitteprojat.modules.MenuModel

class MoreMenuActivity : AppCompatActivity() {

    private lateinit var ivBack: ImageView
    private lateinit var rvMenu: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_menu)

        ivBack = findViewById(R.id.ivBack1)
        rvMenu = findViewById(R.id.rvMenu)

        ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        rvMenu.layoutManager = GridLayoutManager(this, 4)

        val menuList = arrayListOf(

            MenuModel(R.drawable.ic_leads, "Leads"),
            MenuModel(R.drawable.ic_opportunity, "Opportunities"),
            MenuModel(R.drawable.ic_service, "Service\nRequest"),
            MenuModel(R.drawable.ic_activity, "Activities"),

            MenuModel(R.drawable.ic_customer, "Customers"),
            MenuModel(R.drawable.ic_location, "Around\nMe"),
            MenuModel(R.drawable.ic_collection, "Collections"),
            MenuModel(R.drawable.ic_approval, "Approvals"),

            MenuModel(R.drawable.ic_document, "Documents"),
            MenuModel(R.drawable.ic_performance, "Performance"),
            MenuModel(R.drawable.ic_campaign, "Campaigns"),
            MenuModel(R.drawable.ic_ai, "AI Assistant")
        )

        rvMenu.adapter = MoreMenuAdapter(menuList) { menu ->

            when (menu.title) {

                "Leads" -> {
                    startActivity(Intent(this, CreatLeadActivity::class.java))
                }

                "Opportunities" -> {
                    startActivity(Intent(this, OppornityDetailsActivity::class.java))
                }

                "Service\nRequest" -> {
                    startActivity(Intent(this, ServiceQulaityActivity::class.java))
                }

                "Activities" -> {
                    startActivity(Intent(this, ActivityTaskActivity::class.java))
                }

                "Customers" -> {
                    startActivity(Intent(this, customer360Activity::class.java))
                }

                "Around\nMe" -> {
                Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()

//                    startActivity(Intent(this, AroundMeActivity::class.java))
                }
//
                "Collections" -> {
                    Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()

//                    startActivity(Intent(this, CollectionsActivity::class.java))
                }
//
                "Approvals" -> {
                    Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()


//                    startActivity(Intent(this, ApprovalActivity::class.java))
                }
//
                "Documents" -> {
                    Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()

//                    startActivity(Intent(this, DocumentsActivity::class.java))
                }

                "Performance" -> {
                    Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()

//                    startActivity(Intent(this, SalesPriparnceActivity::class.java))
                }

                "Campaigns" -> {
                    Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()

//                    startActivity(Intent(this, CampaignActivity::class.java))
                }

                "AI Assistant" -> {Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()

//                    startActivity(Intent(this, AIAssistantActivity::class.java))
                }
            }
        }
    }
}