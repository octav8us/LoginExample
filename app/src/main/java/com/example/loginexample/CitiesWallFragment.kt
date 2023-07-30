package com.example.loginexample

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Parcel
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginexample.databinding.FragmentCitiesWallBinding


class CitiesWallFragment() : Fragment(R.layout.fragment_cities_wall) {

    companion object { val  cities = listOf<City>(
        City("Venice ", 200,  R.drawable.city_0 ,"Venice is a city in northeastern Italy that is built on a series of canals. The city is known for its unique architecture, gondolas, and St. Mark's Square. Other popular tourist destinations in Venice include the Doge's Palace, a former royal residence, and the Rialto Bridge, a 16th-century bridge. \n" ),
        City("Milano", 150,  R.drawable.city_1 , "Milan is a city in Northern Italy that is known for its fashion, design, and architecture. The city is home to the Duomo, a Gothic cathedral, and the Galleria Vittorio Emanuele II, a luxury shopping arcade. Other popular tourist destinations in Milan include the Pinacoteca di Brera, a fine art museum, and the Castello Sforzesco, a medieval castle. \n" ),
        City("Greece", 122,  R.drawable.city_2 , "Greece is a country in Southeast Europe with a rich history dating back to the ancient world. The capital city, Athens, is home to the Acropolis, a UNESCO World Heritage Site. Other popular tourist destinations in Greece include Mykonos, Santorini, and Rhodes. Greece is also known for its delicious food, including moussaka, souvlaki, and baklava. \n" ),
    )}
    private lateinit var binding: FragmentCitiesWallBinding
    private lateinit var citiesWallFragment: CitiesWallFragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {



        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter=CardAdapter(cities)
        val recyclerView: RecyclerView = view.findViewById(R.id.citiesRecyclerView)
        recyclerView.adapter= adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

    }
}