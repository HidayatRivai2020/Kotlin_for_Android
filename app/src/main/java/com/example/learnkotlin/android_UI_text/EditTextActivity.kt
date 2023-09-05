package com.example.learnkotlin.android_UI_text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.learnkotlin.R

class EditTextActivity : AppCompatActivity() {
    lateinit var myEditText: EditText
    lateinit var myButton: Button
    lateinit var myTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        myEditText = findViewById(R.id.editTextText5)
        myButton = findViewById(R.id.button5)
        myTextView = findViewById(R.id.textView)

        myButton.setOnClickListener {
            var stringText:String = myEditText.text.toString()
            myTextView.text = stringText
        }
    }
}