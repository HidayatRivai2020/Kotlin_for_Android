package com.example.learnkotlin.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learnkotlin.R

class FragmentExample : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.i("myFragment", "-- onAttach --")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("myFragment", "-- onCreate --")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("myFragment", "-- onCreateView --")
        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("myFragment", "-- onViewCreated --")
    }

    override fun onStart() {
        super.onStart()
        Log.i("myFragment", "-- onStart --")
    }

    override fun onStop() {
        super.onStop()
        Log.i("myFragment", "-- onStop --")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("myFragment", "-- onDestroyView --")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("myFragment", "-- onDestroy --")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("myFragment", "-- onDetach --")
    }
}