package com.example.learnkotlin.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.learnkotlin.R

class ServicesActivity : AppCompatActivity() {
    lateinit var btnService1 : Button
    lateinit var btnService2 : Button
    lateinit var btnService3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        btnService1 = findViewById(R.id.btnService1)
        btnService2 = findViewById(R.id.btnService2)
        btnService3 = findViewById(R.id.btnService3)

        btnService1.setOnClickListener {
            val intent = Intent(this@ServicesActivity, ClassicServiceExample::class.java)
            startService(intent)
        }


        btnService2.setOnClickListener {
            val intent = Intent(this@ServicesActivity, JobIntentServiceExample::class.java)
            JobIntentServiceExample.myBackgroundService(this@ServicesActivity, intent)
        }


        btnService3.setOnClickListener {
            val intent = Intent(this@ServicesActivity, ClassicServiceExample::class.java)
            stopService(intent)
        }
    }
}