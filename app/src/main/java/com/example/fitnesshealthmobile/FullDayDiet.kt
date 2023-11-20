package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FullDayDiet : AppCompatActivity() {

    private lateinit var btnDP2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_day_diet)

        this.btnDP2 = findViewById<Button>(R.id.btnDP2)

        btnDP2.setOnClickListener {
            val i = Intent(this, DietPlanning::class.java)

            startActivity(i)
        }
    }
}