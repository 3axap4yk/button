package com.example.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.firstproject.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding //binding
    //private val stringName = String()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false) //connection binding




        binding.apply{

            buttonCube.setOnClickListener{ view: View ->
                view.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToCubeFragment()) //button transition to fragment with cube
            }

            buttonRand.setOnClickListener{ view: View ->
                view.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToRandFragment()) //button transition to fragment with randomize
            }

            val stringName = binding.editTextName.text.toString() //safe args

            buttonSettings.setOnClickListener{ view: View ->
                view.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSettingsFragment("zaxar" /*safe args*/)) //button transition to fragment settings
            }


        }


        return binding.root
    }



}