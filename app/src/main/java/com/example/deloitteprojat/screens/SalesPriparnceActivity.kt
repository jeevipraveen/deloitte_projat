package com.example.deloitteprojat.screens

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.deloitteprojat.R
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter

class SalesPriparnceActivity : AppCompatActivity() {

    private lateinit var lineChart: LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales_priparnce)

        lineChart = findViewById(R.id.lineChart)

        setupChart()
    }

    private fun setupChart() {

        val achievedEntries = arrayListOf(
            Entry(0f, 1f),
            Entry(1f, 2f),
            Entry(2f, 2.5f),
            Entry(3f, 3.2f),
            Entry(4f, 4.1f),
            Entry(5f, 4.8f)
        )

        val targetEntries = arrayListOf(
            Entry(0f, 2f),
            Entry(1f, 2.5f),
            Entry(2f, 3f),
            Entry(3f, 3.5f),
            Entry(4f, 4f),
            Entry(5f, 5f)
        )

        val achievedDataSet = LineDataSet(achievedEntries, "Achieved")
        achievedDataSet.color = Color.parseColor("#1565C0")
        achievedDataSet.lineWidth = 3f
        achievedDataSet.circleRadius = 4f
        achievedDataSet.setCircleColor(Color.parseColor("#1565C0"))
        achievedDataSet.valueTextSize = 10f

        val targetDataSet = LineDataSet(targetEntries, "Target")
        targetDataSet.color = Color.GRAY
        targetDataSet.enableDashedLine(10f, 5f, 0f)
        targetDataSet.lineWidth = 2f
        targetDataSet.setDrawCircles(false)
        targetDataSet.valueTextSize = 10f

        val lineData = LineData(achievedDataSet, targetDataSet)

        lineChart.data = lineData

        val months = arrayOf(
            "Dec",
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May"
        )

        lineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        lineChart.xAxis.granularity = 1f
        lineChart.xAxis.valueFormatter =
            IndexAxisValueFormatter(months)

        lineChart.axisLeft.axisMinimum = 0f
        lineChart.axisLeft.axisMaximum = 5f

        lineChart.axisRight.isEnabled = false
        lineChart.description.isEnabled = false
        lineChart.setTouchEnabled(false)

        lineChart.invalidate()
    }
}