package com.example.learnkotlin.Intents

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.learnkotlin.R

class SecondActivity : AppCompatActivity() {
    lateinit var result: TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        result = findViewById(R.id.IntentResultText)
        val name = intent.getStringExtra("nameText").toString()
        val age = intent.getStringExtra("ageText").toString()
        result.text = "Your name is $name and your age is $age"
    }
}