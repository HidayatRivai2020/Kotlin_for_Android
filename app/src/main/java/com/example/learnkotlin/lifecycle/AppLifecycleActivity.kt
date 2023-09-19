package com.example.learnkotlin.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.learnkotlin.R

class AppLifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_lifecycle)

        Log.d("Message", "-- onCreate --")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "-- onPause --")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "-- onDestroy --")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "-- onRestart --")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "-- onResume --")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "-- onStart --")
    }


}