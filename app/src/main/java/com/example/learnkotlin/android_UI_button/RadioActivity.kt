package com.example.learnkotlin.android_UI_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import com.example.learnkotlin.R

class RadioActivity : AppCompatActivity() {

    var gender: String = ""
    var job: String = ""
    lateinit var male : RadioButton
    lateinit var female : RadioButton
    lateinit var farmer : RadioButton
    lateinit var fisher : RadioButton
    lateinit var doctor : RadioButton
    lateinit var button : Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)

        male = findViewById(R.id.radioMale)
        female = findViewById(R.id.radioFemale)
        farmer = findViewById(R.id.radioFarmer)
        fisher = findViewById(R.id.radioFisher)
        doctor = findViewById(R.id.radioDoctor)
        button = findViewById(R.id.button11)
        result = findViewById(R.id.textView12)

        button.setOnClickListener {
            gender = if (male.isChecked) {
                male.text.toString()
            } else if (female.isChecked) {
                female.text.toString()
            } else {
                ""
            }

            job = if (doctor.isChecked) {
                doctor.text.toString()
            } else if (farmer.isChecked) {
                farmer.text.toString()
            } else if (fisher.isChecked) {
                fisher.text.toString()
            } else {
                ""
            }

            result.text = "You are a $gender, your job is $job"

        }
    }
}