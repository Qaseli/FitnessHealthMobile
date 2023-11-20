package com.example.fitnesshealthmobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class BestWorkout : AppCompatActivity() {

    private lateinit var btnIsp1: ImageButton
    private lateinit var btnIsp2: ImageButton
    private lateinit var btnIsp3: ImageButton
    private lateinit var btnIsp4: ImageButton
    private lateinit var btnIsp5: ImageButton
    private lateinit var btnIsp6: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_workout)

        btnIsp1 = findViewById<ImageButton>(R.id.btnIsp1)
        btnIsp2 = findViewById<ImageButton>(R.id.btnIsp2)
        btnIsp3 = findViewById<ImageButton>(R.id.btnIsp3)
        btnIsp4 = findViewById<ImageButton>(R.id.btnIsp4)
        btnIsp5 = findViewById<ImageButton>(R.id.btnIsp5)
        btnIsp6 = findViewById<ImageButton>(R.id.btnIsp6)

        btnIsp1.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qLBImHhCXSw"))

            startActivity(i)
        }
        btnIsp2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Brkz-7w8gsY"))

            startActivity(i)
        }
        btnIsp3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=otzWCWpuW-A"))

            startActivity(i)
        }
        btnIsp4.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eL4kArsZ57I"))

            startActivity(i)
        }
        btnIsp5.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=tJWhbonMZX8"))

            startActivity(i)
        }
        btnIsp6.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1-KvIEU03yc"))

            startActivity(i)
        }
    }
}