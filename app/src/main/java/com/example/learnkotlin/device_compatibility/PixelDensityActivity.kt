package com.example.learnkotlin.device_compatibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnkotlin.R

class PixelDensityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.ic_launcher)
        setContentView(R.layout.activity_pixel_density)
    }
}