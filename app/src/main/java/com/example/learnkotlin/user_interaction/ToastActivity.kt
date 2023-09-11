package com.example.learnkotlin.user_interaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.learnkotlin.R

class ToastActivity : AppCompatActivity() {
    lateinit var showToast : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        showToast = findViewById(R.id.buttonShowToast)
        showToast.setOnClickListener {
            Toast.makeText(applicationContext, "This is a toast message", Toast.LENGTH_LONG).show()
        }
    }

}