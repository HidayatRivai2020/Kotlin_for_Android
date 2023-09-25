package com.example.learnkotlin.data_saving

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.example.learnkotlin.R

class SharedPreferencesActivity : AppCompatActivity() {
    lateinit var userName : EditText
    lateinit var userMessage : EditText
    lateinit var counter : Button
    lateinit var remember : CheckBox

    var count = 0
    var name:String? = null
    var message:String? = null
    var isChecked:Boolean? = null

    lateinit var sharedPreferences : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        userName = findViewById(R.id.spTextView)
        userMessage = findViewById(R.id.spMultiText2)
        counter = findViewById(R.id.spButton)
        remember = findViewById(R.id.spCheckbox)

        counter.setOnClickListener {
            count++
            counter.text = "$count"
        }
    }

    override fun onPause() {
        super.onPause()
        saveData()
    }

    override fun onResume() {
        super.onResume()
        retrieveData()
    }

    fun saveData() {
        sharedPreferences = this.getSharedPreferences("saveData", Context.MODE_PRIVATE)
        name = userName.text.toString()
        message = userMessage.text.toString()
        isChecked = remember.isChecked

        val editor = sharedPreferences.edit()
        editor.putString("key name", name)
        editor.putString("key message", message)
        editor.putInt("key count", count)
        editor.putBoolean("key remember", isChecked!!)
        editor.apply()
        Toast.makeText(applicationContext, "Your Data is Saved.", Toast.LENGTH_LONG).show()

    }

    fun retrieveData() {
        sharedPreferences = this.getSharedPreferences("saveData", Context.MODE_PRIVATE)
        name = sharedPreferences.getString("key name", null)
        message = sharedPreferences.getString("key message", null)
        count = sharedPreferences.getInt("key count", 0)
        isChecked = sharedPreferences.getBoolean("key count", isChecked!!)

        userName.setText(name)
        userMessage.setText(message)
        counter.setText(count)
        remember.isChecked = isChecked!!
    }
}