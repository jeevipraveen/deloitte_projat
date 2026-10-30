package com.example.deloitteprojat.screens

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.deloitteprojat.R
import com.example.deloitteprojat.adapters.DocumentAdapter
import com.example.deloitteprojat.model.Document

import androidx.recyclerview.widget.RecyclerView

class DocumentActivity : AppCompatActivity() {
    private lateinit var ivBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document)


        ivBack = findViewById(R.id.btnBack)

        ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        val rvDocuments = findViewById<RecyclerView>(R.id.rvDocuments)
        val documentList = listOf(
            Document("KYC Documents", "5 Files", R.drawable.ic_document),
            Document("Financial Statements", "8 Files", R.drawable.ic_document),
            Document("Board Resolutions", "3 Files", R.drawable.ic_document),
            Document("Loan Proposals", "4 Files", R.drawable.ic_document),
            Document("Insurance Documents", "6 Files", R.drawable.ic_document),
            Document("Others", "12 Files", R.drawable.ic_document)
        )

        rvDocuments.layoutManager = LinearLayoutManager(this)
        rvDocuments.adapter = DocumentAdapter(documentList)
    }
}