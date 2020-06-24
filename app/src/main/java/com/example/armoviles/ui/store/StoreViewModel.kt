package com.example.armoviles.ui.store

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StoreViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Tienda fuera de servicio"
    }
    val text: LiveData<String> = _text
}
