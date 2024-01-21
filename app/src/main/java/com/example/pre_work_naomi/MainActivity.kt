package com.example.pre_work_naomi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.welcome_button)
        button.setOnClickListener {
            Log.v("Hello World", "Button Clicked!")
            Toast.makeText(this, "Wohoo!, it worked. hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}