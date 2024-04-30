package com.test.habitaciones

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.R

class HbitacionesActivity: AppCompatActivity() {
    val listHabitaciones = listOf(
        Habitaciones("Habitacion Familiar", 4.0f, "$40","En la habitación del hotel, la suave luz se filtra, sobre las sábanas blancas y la cama acogedora. Las cortinas ondean con elegancia frente a la ventana, mientras el silencio envuelve cada rincón, sobre las sábanas blancas y la cama acogedora. Las cortinas ondean con elegancia frente a la ventana, mientras el silencio envuelve cada rincón.", R.drawable.habitacion1),
        Habitaciones("Habitacion Matrimonial", 5.0f, "$60","En la amplia suite del hotel, la tenue iluminación se desliza delicadamente, iluminando las sábanas de seda y la cama envolvente. Las cortinas ondean graciosamente frente a la ventana, mientras el sosiego impregna cada rincón, envolviendo las sábanas de seda y la cama envolvente. El silencio se adueña de la atmósfera, creando una sensación de calma absoluta.", R.drawable.habitacion2),
        Habitaciones("Habitacion Personal", 3.0f, "$20","Dentro de la espaciosa habitación del hotel, la luz tenue se desliza suavemente, bañando las sábanas impecables y la cama mullida. Las cortinas ondean con elegancia frente a la ventana, mientras el silencio se extiende por cada esquina, envolviendo las sábanas impecables y la cama mullida. La tranquilidad impregna el ambiente, brindando un oasis de paz y relajación.", R.drawable.habitacion3)
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habitacion)

        val recyclerhabitaciones = findViewById<RecyclerView>(R.id.recyclerHabitaciones)
        recyclerhabitaciones.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = HabitacionesAdapter(listHabitaciones)
        }
    }
}