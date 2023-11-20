package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cubacuba : AppCompatActivity() {

    private lateinit var btnBeck: Button
    private lateinit var btnSport: Button
    private lateinit var btnDP: Button
    private lateinit var btnMotivate: Button
    private lateinit var btnCalc: Button
    private lateinit var btnFB : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cubacuba)

        btnFB = findViewById<Button>(R.id.btnFB)

        btnFB.setOnClickListener {
        val i = Intent(this, Feedback::class.java)

        startActivity(i)
        }

        btnBeck = findViewById<Button>(R.id.btnBack)

        btnBeck.setOnClickListener {
            val i = Intent(this, Welcome::class.java)

            startActivity(i)
        }

        //ButtonSport
        this.btnSport = findViewById<Button>(R.id.btnSport)

        btnSport.setOnClickListener {
            val i = Intent(this, Sports::class.java)

            startActivity(i)
        }

        //Button Diet Planning
        this.btnDP = findViewById<Button>(R.id.btnDP)

        btnDP.setOnClickListener {
            val i = Intent(this, DietPlanning::class.java)

            startActivity(i)

        }

        //Button Motivated
        this.btnMotivate = findViewById<Button>(R.id.btnMotivate)

        btnMotivate.setOnClickListener {
            val i = Intent(this, Motivate::class.java)

            startActivity(i)

        }
        this.btnCalc = findViewById<Button>(R.id.btnCalc)

        btnCalc.setOnClickListener {
            val i = Intent(this, Calcbmi::class.java)

            startActivity(i)

        }
    }
}