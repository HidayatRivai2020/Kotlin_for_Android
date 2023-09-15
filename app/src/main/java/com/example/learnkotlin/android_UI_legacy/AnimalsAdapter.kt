package com.example.learnkotlin.android_UI_legacy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.learnkotlin.R

class AnimalsAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>
) : BaseAdapter() {

    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.animals_grid_layout, parent, false)

        var animalName : TextView = view.findViewById(R.id.animalTextView)
        var animalImage : ImageView = view.findViewById(R.id.animal_image_view)

        animalName.text = nameList[position]
        animalImage.setImageResource(imageList[position])

        return view
    }

}