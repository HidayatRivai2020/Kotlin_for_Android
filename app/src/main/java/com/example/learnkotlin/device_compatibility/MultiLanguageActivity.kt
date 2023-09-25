package com.example.learnkotlin.device_compatibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.learnkotlin.R

class MultiLanguageActivity : AppCompatActivity() {
    lateinit var show : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_language)

        show = findViewById(R.id.mlBtn1)
        show.setOnClickListener {
            Toast.makeText(applicationContext, R.string.show_toast_message, Toast.LENGTH_LONG).show()
        }
    }
}