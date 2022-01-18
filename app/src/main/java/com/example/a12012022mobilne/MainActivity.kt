package com.example.a12012022mobilne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var liczba = 1
        findViewById<Button>(R.id.pomniejszenieobrazka).setOnClickListener {
            liczba -=1
        }
        findViewById<Button>(R.id.powiekszenieobrazka).setOnClickListener {
            liczba +=1
        }
        when(liczba){
            0 -> liczba = 1
            1 -> findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pika5)
            2 -> findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.umbreon)
            3 -> findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.lapras)
            4 -> findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.home130gyarados_shiny)
            5 -> liczba = 5
        }


    }
}