package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnN = findViewById<Button>(R.id.btnStart)

        btnN.setOnClickListener{
            val i = Intent(this, Manual::class.java)

            startActivity(i)
        }
    }
}