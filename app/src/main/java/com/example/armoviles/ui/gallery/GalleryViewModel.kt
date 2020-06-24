package com.example.armoviles.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Galeria de fotos"
    }
    val text: LiveData<String> = _text
}