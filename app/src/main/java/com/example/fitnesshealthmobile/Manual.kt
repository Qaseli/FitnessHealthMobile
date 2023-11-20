package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Manual : AppCompatActivity() {

    private lateinit var btnComeCome: Button
    private lateinit var btnBackBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual)

        this.btnComeCome = findViewById<Button>(R.id.btnComeCome)
        this.btnBackBack = findViewById<Button>(R.id.btnBackBack)


        btnBackBack.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }



        btnComeCome.setOnClickListener{
            val i = Intent(this, Welcome::class.java)
            startActivity(i)
        }
    }
}