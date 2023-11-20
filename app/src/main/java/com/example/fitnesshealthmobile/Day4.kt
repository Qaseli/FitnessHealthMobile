package com.example.fitnesshealthmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Day4 : AppCompatActivity() {

    private lateinit var btnWomen4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day4)

        this.btnWomen4 = findViewById<Button>(R.id.btnWomen4)

        btnWomen4.setOnClickListener {
            val i = Intent(this, Women::class.java)

            startActivity(i)
        }
    }
}