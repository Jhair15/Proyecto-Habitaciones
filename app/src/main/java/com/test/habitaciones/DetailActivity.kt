package com.test.habitaciones

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.test.R

class DetailActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetailPrin = findViewById<ImageView>(R.id.imgDetailPrin)
        val textHabitacion= findViewById<TextView>(R.id.textHabitacion)
        val textPrecio= findViewById<TextView>(R.id.textPrecio)
        val textDescripcion= findViewById<TextView>(R.id.textDescripcion)

        val  intent = intent

        val image = intent?.getIntExtra("image",0)
        val title = intent?.getStringExtra("title")
        val precio = intent?.getStringExtra("precio")
        val descripcion = intent?.getStringExtra("descripcion")


        if (image != null) {
            imgDetailPrin.setImageResource(image)
        }

        textHabitacion.text = title
        textPrecio.text = precio
        textDescripcion.text = descripcion


    }
}