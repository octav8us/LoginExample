package com.example.loginexample

import android.content.Context
import android.content.res.Resources
import androidx.core.content.res.TypedArrayUtils.getString
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.loginexample.databinding.CityCardBinding

class CardViewHolder (

    private val binding: CityCardBinding
        ): RecyclerView.ViewHolder(binding.root){

            fun bind(city: City  , index :Int ,context: Context){
                binding.cardCityName.text = city.name
                binding.cardCityImage.setImageResource(city.cityImage)
                binding.cardCityReview.text = context.getString(R.string.reviews, city.reviewsCount , )
                val action =   CitiesWallFragmentDirections.actionCitiesWallFragmentToCityDetailsFragment(index)

                binding.cityCard.setOnClickListener {

                    binding.root.findNavController( ).navigate(action)
                }
            }

}
