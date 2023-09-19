package com.example.learnkotlin.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicServiceExample : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("Service", "Classic service is started")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("Service", "Classic service command is started")
        Log.d("Service Thread", Thread.currentThread().name)

//        stopSelf()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service", "Classic service is stopped")
    }

}