package com.example.armoviles.ui.animal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnimalViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Ajolote"
    }
    val text: LiveData<String> = _text
}
