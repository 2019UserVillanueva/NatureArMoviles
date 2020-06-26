package com.example.armoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso



class HomeActivity : AppCompatActivity() {

    internal lateinit var img_1 : ImageView
    internal lateinit var img_2 : ImageView
    internal lateinit var img_3 : ImageView
    internal lateinit var img_4 : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        img_1 = findViewById<View>(R.id.image_1) as ImageView
        val url_1 = "https://static.nationalgeographic.es/files/styles/image_3200/public/NationalGeographic_2697714.jpg?w=1600&h=900"
        Picasso.with(this).load(url_1).into(img_1)

        img_2 = findViewById<View>(R.id.image_2) as ImageView
        val url_2 = "https://static.scientificamerican.com/espanol/cache/file/050D641B-C40F-460A-B892534B0024CB3C_source.jpg?w=590&h=800&4147C8A7-B3A4-4126-9293322177AC2D1C"
        Picasso.with(this).load(url_2).into(img_2)

        img_3 = findViewById<View>(R.id.image_3) as ImageView
        val url_3 = "https://static.nationalgeographic.es/files/styles/image_3200/public/Lobo%20mexicano.jpg?w=1600&h=900"
        Picasso.with(this).load(url_3).into(img_3)

        img_4 = findViewById<View>(R.id.image_4) as ImageView
        val url_4 = "https://vignette.wikia.nocookie.net/reinoanimalia/images/6/6f/Ocelote_1.png/revision/latest/scale-to-width-down/310?cb=20140325204956&path-prefix=es"
        Picasso.with(this).load(url_4).into(img_4)

    }







}
