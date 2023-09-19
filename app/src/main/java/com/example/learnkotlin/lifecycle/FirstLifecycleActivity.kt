package com.example.learnkotlin.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.learnkotlin.R

class FirstLifecycleActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var button2: Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_lifecycle)

        textView = findViewById(R.id.LifecycleText)
        button = findViewById(R.id.LB1)
        button2 = findViewById(R.id.LB2)

        button.setOnClickListener {
            counter += 1
            textView.text = counter.toString()
        }

        button2.setOnClickListener {
            var intent = Intent(this@FirstLifecycleActivity, SecondLifecycleActivity::class.java)
            startActivity(intent)
        }

        Log.d("Message", "-- onCreate first activity --")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "-- onPause first activity --")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "-- onDestroy first activity --")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "-- onRestart first activity --")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "-- onResume first activity --")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "-- onStart first activity --")
    }
}