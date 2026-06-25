package com.example.deloitteprojat.screens

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.deloitteprojat.R
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.components.Legend

class ServiceQulaityActivity : AppCompatActivity() {

    private lateinit var pieChart: PieChart
    private lateinit var ivBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_qulaity)

        pieChart = findViewById(R.id.pieChart)

        loadDonutChart()
        ivBack = findViewById(R.id.ivBack)

        ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun loadDonutChart() {

        val entries = ArrayList<PieEntry>()

        entries.add(PieEntry(30f, "Account Related"))
        entries.add(PieEntry(20f, "Loans"))
        entries.add(PieEntry(10f, "Digital Banking"))
        entries.add(PieEntry(16f, "Others"))

        val dataSet = PieDataSet(entries, "")

        dataSet.colors = arrayListOf(
            Color.parseColor("#1565C0"), // Blue
            Color.parseColor("#7C3AED"), // Purple
            Color.parseColor("#06B6D4"), // Cyan
            Color.parseColor("#9CA3AF")  // Gray
        )

        dataSet.sliceSpace = 2f
        dataSet.selectionShift = 0f

        val data = PieData(dataSet)
        data.setDrawValues(false)

        pieChart.data = data

        pieChart.description.isEnabled = false
        pieChart.legend.isEnabled = false

        pieChart.isRotationEnabled = false
        pieChart.setUsePercentValues(false)

        pieChart.isDrawHoleEnabled = true
        pieChart.holeRadius = 62f
        pieChart.transparentCircleRadius = 0f
        pieChart.setHoleColor(Color.WHITE)

        pieChart.centerText = ""
        pieChart.setEntryLabelColor(Color.TRANSPARENT)

        pieChart.animateY(1200)

        pieChart.invalidate()
    }
}