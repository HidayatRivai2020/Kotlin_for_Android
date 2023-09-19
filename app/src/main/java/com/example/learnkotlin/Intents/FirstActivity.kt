package com.example.learnkotlin.Intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.learnkotlin.R

class FirstActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var age : EditText
    lateinit var send : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        name = findViewById(R.id.IntentTextName)
        age = findViewById(R.id.IntentTextAge)
        send = findViewById(R.id.IntentButtonSend)

        send.setOnClickListener {
            var intent = Intent(this@FirstActivity, SecondActivity::class.java)
            intent.putExtra("nameText", name.text.toString())
            intent.putExtra("ageText", age.text.toString())
            startActivity(intent)
        }
    }
}