package com.example.learnkotlin.android_UI_button

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.learnkotlin.R

class ButtonActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var textView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        button = findViewById(R.id.button4)
        textView = findViewById(R.id.textView4)

        button.setOnClickListener {
            textView.setTextColor(Color.WHITE)
            textView.setBackgroundColor(Color.BLACK)
            textView.text = "this text has been updated"
            button.isVisible = false
        }


        textView.setOnClickListener {
            textView.setTextColor(Color.BLACK)
            textView.setBackgroundColor(Color.WHITE)
            textView.text = getText(R.string.textview)
            button.isVisible = true
        }
    }
}