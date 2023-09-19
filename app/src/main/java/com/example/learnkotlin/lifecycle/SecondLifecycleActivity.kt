package com.example.learnkotlin.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.learnkotlin.R

class SecondLifecycleActivity : AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_lifecycle)

        button = findViewById(R.id.btnLB)

        button.setOnClickListener {
            var intent = Intent(this@SecondLifecycleActivity, FirstLifecycleActivity::class.java)
            startActivity(intent)
        }
        Log.d("Message", "-- onCreate Second activity --")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "-- onPause first activity --")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "-- onDestroy second activity --")
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