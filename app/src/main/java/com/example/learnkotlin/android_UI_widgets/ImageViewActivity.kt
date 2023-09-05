package com.example.learnkotlin.android_UI_widgets

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.learnkotlin.R

class ImageViewActivity : AppCompatActivity() {
    lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        myButton = findViewById(R.id.button10)
        myButton.setOnClickListener {
            var image = findViewById<View>(R.id.imageView)
            image.setBackgroundResource(R.drawable.download)
        }
    }
}