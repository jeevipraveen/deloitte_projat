package com.example.deloitteprojat.screens

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.deloitteprojat.R
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter

class performanceActivity : AppCompatActivity() {
    private lateinit var ivBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_performance)


        val lineChart = findViewById<LineChart>(R.id.lineChart)




        ivBack = findViewById(R.id.ivBack1)

        ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        val achieved = arrayListOf(
            Entry(0f, 5f),
            Entry(1f, 8f),
            Entry(2f, 25f),
            Entry(3f, 20f),
            Entry(4f, 30f),
            Entry(5f, 42f)
        )

        val target = arrayListOf(
            Entry(0f, 10f),
            Entry(1f, 15f),
            Entry(2f, 35f),
            Entry(3f, 40f),
            Entry(4f, 45f),
            Entry(5f, 50f)
        )

        val achievedSet = LineDataSet(achieved, "Achieved").apply {
            color = Color.BLUE
            setCircleColor(Color.BLUE)
            circleRadius = 4f
            lineWidth = 2f
        }

        val targetSet = LineDataSet(target, "Target").apply {
            color = Color.GRAY
            setCircleColor(Color.GRAY)
            circleRadius = 4f
            lineWidth = 2f
        }

        lineChart.data = LineData(targetSet, achievedSet)

        val months = arrayOf("Dec", "Jan", "Feb", "Mar", "Apr", "May")

        lineChart.xAxis.apply {
            position = XAxis.XAxisPosition.BOTTOM
            valueFormatter = IndexAxisValueFormatter(months)
            granularity = 1f
        }

        lineChart.axisRight.isEnabled = false
        lineChart.description.isEnabled = false
        lineChart.animateX(1000)
        lineChart.invalidate()
    }
}