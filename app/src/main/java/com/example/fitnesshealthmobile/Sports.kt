package com.example.fitnesshealthmobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Sports : AppCompatActivity() {

    private lateinit var btnImg1: ImageButton
    private lateinit var btnImg2: ImageButton
    private lateinit var btnImg3: ImageButton
    private lateinit var btnImg4: ImageButton
    private lateinit var btnImg5: ImageButton
    private lateinit var btnImg6: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)

        btnImg1 = findViewById<ImageButton>(R.id.btnImg1)
        btnImg2 = findViewById<ImageButton>(R.id.btnImg2)
        btnImg3 = findViewById<ImageButton>(R.id.btnImg3)
        btnImg4 = findViewById<ImageButton>(R.id.btnImg4)
        btnImg5 = findViewById<ImageButton>(R.id.btnImg5)
        btnImg6 = findViewById<ImageButton>(R.id.btnImg6)

        btnImg1.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xW79HPiyidk"))

            startActivity(i)
        }
        btnImg2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=X27F4kgBJKk"))

            startActivity(i)
        }
        btnImg3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5kSc3eWdZdc"))

            startActivity(i)
        }
        btnImg4.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iCQ2gC4DqJw"))

            startActivity(i)
        }
        btnImg5.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PJNorBZk6WQ"))

            startActivity(i)
        }
        btnImg6.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=imNWaHtGwnw"))

            startActivity(i)
        }
    }
}