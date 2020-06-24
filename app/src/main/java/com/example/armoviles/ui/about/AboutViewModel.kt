package com.example.armoviles.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "El proyecto consiste en desarrollar una aplicación móvil " +
                "que use la realidad aumentada, donde se tiene una mascota " +
                "la cual representa un animal en peligro de extinción " +
                "(axolote, panda), para crear conciencia en las personas sobre " +
                "el impacto negativo del ser humano en especies silvestres."
    }
    val text: LiveData<String> = _text
}