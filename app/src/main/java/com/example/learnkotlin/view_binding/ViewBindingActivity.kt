package com.example.learnkotlin.view_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnkotlin.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = mainBinding.root

        setContentView(view)

        mainBinding.btnVB.setOnClickListener {
            mainBinding.txtVB.text = mainBinding.inputVB.text.toString()
        }


    }
}