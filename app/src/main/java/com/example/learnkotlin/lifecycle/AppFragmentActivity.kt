package com.example.learnkotlin.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.learnkotlin.R

class AppFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_fragment)

        Log.i("myFragment", "-- onCreate in Activity--")
    }
}