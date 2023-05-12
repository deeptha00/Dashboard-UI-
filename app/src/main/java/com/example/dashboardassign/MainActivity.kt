package com.example.dashboardassign

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dashboardassign.ui.theme.DashboardAssignTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val r1 = findViewById<RelativeLayout>(R.id.r1)
        val r2 = findViewById<RelativeLayout>(R.id.r2)
        val r3 = findViewById<RelativeLayout>(R.id.r3)
        val r4 = findViewById<RelativeLayout>(R.id.r4)
        val r5 = findViewById<RelativeLayout>(R.id.r5)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val button = findViewById<Button>(R.id.button)


    }
}

