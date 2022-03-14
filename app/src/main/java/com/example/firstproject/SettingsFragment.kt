package com.example.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.firstproject.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

  private lateinit var binding: FragmentSettingsBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false)

        val args = SettingsFragmentArgs.fromBundle(requireArguments()) //safe args
        Toast.makeText(context, "Name: ${args.stringName}", Toast.LENGTH_LONG).show()

        binding.apply {

            buttonCube.setOnClickListener{view: View ->
                view.findNavController().navigate(SettingsFragmentDirections.actionSettingsFragmentToSettingsCubeFragment()) //button transition to fragment settings with cube
            }

            buttonRand.setOnClickListener{view: View ->
                view.findNavController().navigate(SettingsFragmentDirections.actionSettingsFragmentToSettingsRandFragment())
            }

        }

        return binding.root
    }
}