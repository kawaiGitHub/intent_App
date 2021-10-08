package com.test.intentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ma2)

        val btnBack:Button = findViewById(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }
    }
}