package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Men : AppCompatActivity() {

    private lateinit var btnDP1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men)

        this.btnDP1 = findViewById<Button>(R.id.btnDP1)

        btnDP1.setOnClickListener {
            val i = Intent(this, DietPlanning::class.java)

            startActivity(i)
        }
    }
}