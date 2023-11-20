package com.example.fitnesshealthmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calcbmi : AppCompatActivity() {

    private lateinit var btnKira: Button
    private lateinit var weight: EditText
    private lateinit var height: EditText
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcbmi)

        btnKira = findViewById<Button>(R.id.btnKira)
        weight = findViewById<EditText>(R.id.weight)
        height = findViewById<EditText>(R.id.height)
        result = findViewById<TextView>(R.id.result)


        btnKira.setOnClickListener {

            val h = height.text.toString().toFloat()/100 // we will get the height and convert it to meter
            val w = weight.text.toString().toFloat() // will get the weight from edit text and convert to float
            val res = w/(h*h) // this is the formula to calculate the BMI
            result.text = "%.2f".format(res) // will format our result to display only twi decimal

        }
    }
}