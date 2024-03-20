package com.example.navigationcontroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        var textView = view.findViewById<TextView>(R.id.textView2)
        val bundle = arguments?.getParcelable<MyData>("myData",)
        if (bundle != null){
            textView.text = bundle.name+"${bundle.age}"
            println(bundle.name+"${bundle.age}")
        }
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        return  view
    }
}