package com.example.learnkotlin.android_UI_button

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import com.example.learnkotlin.R

class ToggleActivity : AppCompatActivity() {

    lateinit var result : TextView
    lateinit var toggleButton: ToggleButton
    lateinit var image : ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle)

        toggleButton = findViewById(R.id.toggleButton)
        result = findViewById(R.id.textView6)
        image = findViewById(R.id.imageView3)

        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                image.visibility = View.INVISIBLE
                result.text = "the image is invisible"
            } else {
                image.visibility = View.VISIBLE
                result.text = "the image is visible"
            }
        }
    }
}