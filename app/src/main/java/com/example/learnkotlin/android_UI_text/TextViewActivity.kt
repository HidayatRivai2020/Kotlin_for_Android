package com.example.learnkotlin.android_UI_text

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.learnkotlin.R

class TextViewActivity : AppCompatActivity() {
    lateinit var myText : TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        myText = findViewById(R.id.hello_world)
        myText.setTextColor(Color.DKGRAY)

        myText.setOnClickListener {
            myText.text = "The text has been updated"
            myText.setBackgroundColor(Color.BLACK)
            myText.setTextColor(Color.WHITE)

        }
    }
}