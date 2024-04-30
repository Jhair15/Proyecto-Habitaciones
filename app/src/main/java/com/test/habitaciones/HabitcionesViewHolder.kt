package com.test.habitaciones


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.test.R

class HabitcionesViewHolder(inflater: LayoutInflater,parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_habitacion,parent,false)) {

    val constraintRow: ConstraintLayout = itemView.findViewById(R.id.constraint_row)
    val cardView: CardView = itemView.findViewById(R.id.cardView)

        private var imgPortada: ImageView? = null
        private var textTitulo: TextView? = null
        private var textContenido: TextView? = null
        private var textPrecio: TextView? = null
        private var ratingBar: RatingBar? = null


    init {
        imgPortada = itemView.findViewById(R.id.imgHabitacion)
        textTitulo = itemView.findViewById(R.id.textNombreHabitacion)
        textContenido = itemView.findViewById(R.id.textHabitacionContenido)
        textPrecio = itemView.findViewById(R.id.textPreciohabitacion)
        ratingBar = itemView.findViewById(R.id.ratingBar)

    }

    fun bind(habitaciones: Habitaciones){
        imgPortada?.setImageResource(habitaciones.portada)
        textTitulo?.text = habitaciones.titulo
        textContenido?.text = habitaciones.contenido
        textPrecio?.text = habitaciones.precio
        ratingBar?.rating = habitaciones.stars

    }

}