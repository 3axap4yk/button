package com.example.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.firstproject.databinding.FragmentSettingsCubeBinding


class SettingsCubeFragment : Fragment() {

    private lateinit var binding: FragmentSettingsCubeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings_cube, container, false)

        return binding.root
    }

}