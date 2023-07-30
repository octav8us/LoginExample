package com.example.loginexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CityDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CityDetailsFragment : Fragment() {

    lateinit var city: City
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val index = CityDetailsFragmentArgs.fromBundle(requireArguments()).index
            city = CitiesWallFragment.cities[index]
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
val view = inflater.inflate(R.layout.fragment_city_details, container, false)
        view.findViewById<TextView>(R.id.cityName).text = city.name
        view.findViewById<TextView>(R.id.cityDescreption).text = city.description
        view.findViewById<TextView>(R.id.reviewCount).text = this.getString(R.string.reviews, city.reviewsCount , )


        // Inflate the layout for this fragment
        return view
    }

}