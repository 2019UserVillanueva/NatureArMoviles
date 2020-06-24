package com.example.armoviles.ui.animal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.armoviles.R

class AnimalFragment : Fragment() {

    private lateinit var animalViewModel: AnimalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        animalViewModel =
            ViewModelProviders.of(this).get(AnimalViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_animal, container, false)
        val textView: TextView = root.findViewById(R.id.text_axolotl)
        animalViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
