package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Day2 : AppCompatActivity() {

    private lateinit var btnWomen2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day2)

        this.btnWomen2 = findViewById<Button>(R.id.btnWomen2)

        btnWomen2.setOnClickListener {
            val i = Intent(this, Women::class.java)

            startActivity(i)
        }
    }
}