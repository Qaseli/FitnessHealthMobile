package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Day1 : AppCompatActivity() {

    private lateinit var btnWomen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day1)

        this.btnWomen = findViewById<Button>(R.id.btnWomen)

        btnWomen.setOnClickListener {
            val i = Intent(this, Women::class.java)

            startActivity(i)
        }
    }
}