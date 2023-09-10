package com.example.learnkotlin.android_UI_containers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.learnkotlin.R

class SpinnerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var spinner: Spinner
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        spinner = findViewById(R.id.spinner)
        result = findViewById(R.id.textView13)

        spinner.onItemSelectedListener = this

        var arrayAdapter = ArrayAdapter.createFromResource(
            this, R.array.countries, android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        result.text = "$position"
        if (parent != null) {
            result.text = parent.getItemAtPosition(position).toString()
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}