package com.example.learnkotlin.user_interaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.learnkotlin.R
import com.google.android.material.snackbar.Snackbar

class SnackbarActivity : AppCompatActivity() {
    lateinit var showSnackbar: Button
    lateinit var myLayout : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        showSnackbar = findViewById(R.id.buttonSnackbar)
        myLayout = findViewById(R.id.snackbarLayout)
        showSnackbar.setOnClickListener {
            Snackbar.make(myLayout, "This is a snackbar message", Snackbar.LENGTH_INDEFINITE)
                .setAction("Close", View.OnClickListener {  }).show()
        }
    }
}