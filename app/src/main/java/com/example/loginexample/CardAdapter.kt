package com.example.loginexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginexample.databinding.CityCardBinding

class CardAdapter(private val cities: List<City>) : RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
val from = LayoutInflater.from(parent.context)
        val binding = CityCardBinding.inflate(from, parent, false)
        return CardViewHolder(binding)


    }


    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(cities[position] , position, holder.itemView.context)
    }

    override fun getItemCount(): Int = cities.size

}