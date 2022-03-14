package com.example.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.firstproject.databinding.FragmentRandBinding

class RandFragment : Fragment() {

    private lateinit var binding: FragmentRandBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_rand, container, false)

        binding.apply {
            randomButton.setOnClickListener { resultText() }
            resetButton.setOnClickListener { resetB() }
        }

        return binding.root
    }


    private fun resultText() {

        val n1 = binding.number1.text.toString()
        val n2 = binding.number2.text.toString()

        when {
            (n1 == "") -> Toast.makeText(context, "Введите значения", Toast.LENGTH_SHORT).show()
            (n2 == "") -> Toast.makeText(context, "Введите значения", Toast.LENGTH_SHORT).show()

            (n1.toLong() > n2.toLong()) -> Toast.makeText(context, "Первое число должно быть меньше второго", Toast.LENGTH_LONG).show()

            else -> binding.resultText.text = (n1.toLong()..n2.toLong()).random().toString()
        }

    }


    private fun resetB() {

        binding.resultText.text = null
        binding.number1.text = null
        binding.number2.text = null

    }
}