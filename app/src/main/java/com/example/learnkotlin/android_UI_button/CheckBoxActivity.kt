package com.example.learnkotlin.android_UI_button

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import com.example.learnkotlin.R

class CheckBoxActivity : AppCompatActivity() {
    lateinit var robots : CheckBox
    lateinit var dolls : CheckBox
    lateinit var cars : CheckBox
    lateinit var result7: TextView
    lateinit var result8: TextView
    lateinit var result9: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        robots = findViewById(R.id.checkBox3)
        dolls = findViewById(R.id.checkBox4)
        cars = findViewById(R.id.checkBox5)

        result7 = findViewById(R.id.textView7)
        result8 = findViewById(R.id.textView8)
        result9 = findViewById(R.id.textView9)

        robots.setOnClickListener {
            applyResult(robots, result7)
        }

        dolls.setOnClickListener {
            applyResult(dolls, result8)
        }

        cars.setOnClickListener {
            applyResult(cars, result9)
        }
    }


    @SuppressLint("SetTextI18n")
    fun applyResult(checkBox: CheckBox, result: TextView) {
        if (checkBox.isChecked) {
            result.text = "- ${checkBox.text}"
        } else {
            result.text = ""
        }
    }
}