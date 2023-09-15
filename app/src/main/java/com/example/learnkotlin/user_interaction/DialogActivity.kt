package com.example.learnkotlin.user_interaction

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.learnkotlin.R

class DialogActivity : AppCompatActivity() {
    lateinit var showDialogMessage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        showDialogMessage = findViewById(R.id.buttonDialog)

        showDialogMessage.setOnClickListener {
            showAlertDialog()
        }
    }


    @SuppressLint("SetTextI18n")
    fun showAlertDialog() {
        var alertDialog = AlertDialog.Builder(this@DialogActivity)
        alertDialog.setTitle("Change")
            .setMessage("Do you want to change the text of the button")
            .setIcon(R.drawable.red_warning_24)
            .setCancelable(true)
            .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.cancel()
            })
            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                showDialogMessage.text = "Alert Dialog"
            })
        alertDialog.create().show()
    }
}