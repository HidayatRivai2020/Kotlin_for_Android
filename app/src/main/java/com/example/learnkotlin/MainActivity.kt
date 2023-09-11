package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var showSnackbar: Button
    lateinit var myLayout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackbar = findViewById(R.id.buttonSnackbar)
        myLayout = findViewById(R.id.snackbarLayout)
        showSnackbar.setOnClickListener {
            Snackbar.make(myLayout, "This is a snackbar message", Snackbar.LENGTH_INDEFINITE)
                .setAction("Close", View.OnClickListener {  }).show()
        }
    }
}