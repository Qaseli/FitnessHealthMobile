package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {

    private lateinit var btnActivities: Button
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        this.btnActivities = findViewById<Button>(R.id.btnActivities)
        this.btnBack = findViewById<Button>(R.id.btnBack)


        btnBack.setOnClickListener {
            val i = Intent(this, Manual::class.java)
            startActivity(i)
        }



        btnActivities.setOnClickListener{
            val i = Intent(this, cubacuba::class.java)
            startActivity(i)
        }
    }
}