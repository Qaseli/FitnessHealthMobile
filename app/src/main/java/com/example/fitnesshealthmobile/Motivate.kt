package com.example.fitnesshealthmobile
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Motivate : AppCompatActivity() {

    private lateinit var imb1: ImageButton
    private lateinit var imb2: ImageButton
    private lateinit var imb3: ImageButton
    private lateinit var btnCat3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motivate)

        this.imb1 = findViewById<ImageButton>(R.id.imageButton)
        this.imb2 = findViewById<ImageButton>(R.id.imageButton5)
        this.imb3 = findViewById<ImageButton>(R.id.imageButton2)
        this.btnCat3 = findViewById<Button>(R.id.btnCat3)

        imb1.setOnClickListener {
            val i = Intent(this, BenefitSleeping::class.java)
            startActivity(i)
        }
        imb2.setOnClickListener {
            val i = Intent(this, BestWorkout::class.java)
            startActivity(i)
        }
        imb3.setOnClickListener {
            val i = Intent(this, Dishes::class.java)
            startActivity(i)
        }
        btnCat3.setOnClickListener {
            val i = Intent(this, cubacuba::class.java)
            startActivity(i)
        }
    }
}