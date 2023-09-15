package com.example.learnkotlin.android_UI_containers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R

class RecyclerActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView

    var countryNameList = ArrayList<String>()
    var detailList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var countriesAdapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)


        recyclerView = findViewById(R.id.recycleView)

        recyclerView.layoutManager = LinearLayoutManager(this@RecyclerActivity)

        countryNameList.add("United Kingdom")
        countryNameList.add("Germany")
        countryNameList.add("USA")

        detailList.add("this is United Kingdom Flag")
        detailList.add("this is United Germany Flag")
        detailList.add("this is United USA Flag")

        imageList.add(R.drawable.unitedkingdom)
        imageList.add(R.drawable.germany)
        imageList.add(R.drawable.japan)

        countriesAdapter = CountriesAdapter(countryNameList, detailList, imageList, this@RecyclerActivity)
        recyclerView.adapter = countriesAdapter
    }
}