package com.example.learnkotlin.broadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnkotlin.R

class BroadcastActivity : AppCompatActivity() {
    var br = BroadcastExample()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)

        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(br, filter)
    }

    override fun onStop() {
        super.onStop()
        this.unregisterReceiver(br)
    }
}