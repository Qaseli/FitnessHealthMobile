package com.example.fitnesshealthmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DietPlanning : AppCompatActivity() {

    private lateinit var btnCat2: Button
    private lateinit var btnMen: Button
    private lateinit var btnWomen: Button
    private lateinit var btnFullDayDiet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_planning)

        this.btnCat2 = findViewById<Button>(R.id.btnCat2)
        this.btnMen = findViewById<Button>(R.id.btnM)
        this.btnWomen = findViewById<Button>(R.id.btnW)
        this.btnFullDayDiet = findViewById<Button>(R.id.btnFD)

        btnCat2.setOnClickListener {
            val i = Intent(this, cubacuba::class.java)

            startActivity(i)
        }


        btnMen.setOnClickListener {
            val i = Intent(this, Men::class.java)

            startActivity(i)
        }



        btnWomen.setOnClickListener {
            val i = Intent(this, Women::class.java)

            startActivity(i)
        }

        btnFullDayDiet.setOnClickListener {
            val i = Intent(this, FullDayDiet::class.java)

            startActivity(i)

        }
    }
}