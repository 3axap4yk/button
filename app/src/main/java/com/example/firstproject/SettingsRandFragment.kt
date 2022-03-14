package com.example.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.firstproject.databinding.FragmentSettingsRandBinding
import kotlin.io.path.createTempDirectory


class SettingsRandFragment : Fragment() {

    private lateinit var binding: FragmentSettingsRandBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings_rand, container, false)

        return binding.root
    }

}