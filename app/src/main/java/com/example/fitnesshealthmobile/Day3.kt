package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Day3 : AppCompatActivity() {

    private lateinit var btnWomen3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day3)

        this.btnWomen3 = findViewById<Button>(R.id.btnWomen3)

        btnWomen3.setOnClickListener {
            val i = Intent(this, Women::class.java)

            startActivity(i)
        }
    }
}