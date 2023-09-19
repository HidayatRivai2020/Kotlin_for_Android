package com.example.learnkotlin.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastExample : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var isAirPlane : Boolean = intent!!.getBooleanExtra("state", false)

        if (isAirPlane) {
            Toast.makeText(context, "AirPlane mode is on", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "AirPlane mode is off", Toast.LENGTH_LONG).show()
        }
    }
}