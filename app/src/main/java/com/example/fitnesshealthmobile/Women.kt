package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Women : AppCompatActivity() {

    private lateinit var btnD1: Button
    private lateinit var btnD2: Button
    private lateinit var btnD3: Button
    private lateinit var btnD4: Button
    private lateinit var btnDP3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_women)

        this.btnD1 = findViewById<Button>(R.id.btnD1)
        this.btnD2 = findViewById<Button>(R.id.btnD2)
        this.btnD3 = findViewById<Button>(R.id.btnD3)
        this.btnD4 = findViewById<Button>(R.id.btnD4)
        this.btnDP3 = findViewById<Button>(R.id.btnDP3)

        btnD1.setOnClickListener {
            val i = Intent(this, Day1::class.java)

            startActivity(i)
        }

        btnD2.setOnClickListener {
            val i = Intent(this, Day2::class.java)

            startActivity(i)
        }

        btnD3.setOnClickListener {
            val i = Intent(this, Day3::class.java)

            startActivity(i)
        }

        btnD4.setOnClickListener {
            val i = Intent(this, Day4::class.java)

            startActivity(i)
        }

        btnDP3.setOnClickListener {
            val i = Intent(this, DietPlanning::class.java)

            startActivity(i)
        }
    }
}