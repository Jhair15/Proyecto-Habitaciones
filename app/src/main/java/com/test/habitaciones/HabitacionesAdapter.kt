package com.test.habitaciones

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class HabitacionesAdapter (val list: List<Habitaciones>): RecyclerView.Adapter<HabitcionesViewHolder>(){

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitcionesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return HabitcionesViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: HabitcionesViewHolder, position: Int) {
        val habitaciones: Habitaciones = list[position]
        holder.bind(habitaciones)

        val cont = holder.constraintRow.context
        holder.constraintRow.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)

            intent.putExtra("image",habitaciones.portada)
            intent.putExtra("title",habitaciones.titulo)
            intent.putExtra("precio",habitaciones.precio)
            intent.putExtra("descripcion",habitaciones.contenido)

            it.context.startActivity(intent)

            Toast.makeText(cont, "Slecciono la ${habitaciones.titulo}", Toast.LENGTH_SHORT).show()
        }
    }
}
