package com.example.learnkotlin.android_UI_legacy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.learnkotlin.R

class ListViewActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        listView = findViewById(R.id.listView)
        var countryList = resources.getStringArray(R.array.countries)

        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryList)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, position, id ->
            val countryName = adapterView.getItemAtPosition(position).toString()
            Toast.makeText(applicationContext, "You selected $countryName", Toast.LENGTH_LONG).show()
        }
    }
}