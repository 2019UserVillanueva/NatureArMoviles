package com.example.armoviles.ui.animal2

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.armoviles.R

class Animal2Fragment : Fragment() {
    private lateinit var animal2ViewModel: Animal2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        animal2ViewModel =
            ViewModelProviders.of(this).get(Animal2ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_animal2, container, false)
        val textView: TextView = root.findViewById(R.id.text_panda)
        animal2ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
