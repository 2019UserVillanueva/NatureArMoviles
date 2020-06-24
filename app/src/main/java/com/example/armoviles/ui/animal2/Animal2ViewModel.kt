package com.example.armoviles.ui.animal2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Animal2ViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Panda"
    }
    val text: LiveData<String> = _text
}
