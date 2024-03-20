package com.example.navigationcontroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val button1 = view.findViewById<Button>(R.id.button1)
        val navController = findNavController()

        val data = MyData("Prashant",27)
        val bundle = Bundle().apply {
            putParcelable("myData",data)
        }
        val fragment = SecondFragment()
        fragment.arguments = bundle

        button1.setOnClickListener {
            navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return view
    }
}