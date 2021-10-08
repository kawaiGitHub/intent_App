package com.test.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart:Button = findViewById(R.id.btnStart)

        btnStart.setOnClickListener {
            val intent = Intent(this,MA2::class.java)
            startActivity(intent)
        }
    }
}