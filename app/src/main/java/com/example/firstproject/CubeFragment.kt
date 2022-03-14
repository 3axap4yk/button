package com.example.firstproject

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.firstproject.databinding.FragmentCubeBinding

class CubeFragment : Fragment() {

    private lateinit var binding: FragmentCubeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cube, container, false)

        binding.apply {
            rollButton.setOnClickListener { rollDice() }
            plusButton2.setOnClickListener { plusDice2() }
            plusButton3.setOnClickListener { plusDice3() }
            plusButton4.setOnClickListener { plusDice4() }
            minusButton2.setOnClickListener { minusDice2() }
            minusButton3.setOnClickListener { minusDice3() }
            minusButton4.setOnClickListener { minusDice4() }
            resetButton.setOnClickListener { resetDice() }
        }


        return binding.root
    }

    private fun rollDice() {

        val randomInt1 = (1..6).random()

        val drawableResource1 = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6 //почему просто не написать 6? иначе ошибка
        }

        binding.diceImage1.setImageResource(drawableResource1)
        //Вы можете использовать setImageResource()
        // для изменения изображения представления на другой ресурс. Используйте, например,
        // R.drawable для ссылки на определенные чертежи setImageResource(R.drawable.image_name).

        val drawableResource2 = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImage2.setImageResource(drawableResource2)

        val drawableResource3 = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImage3.setImageResource(drawableResource3)

        val drawableResource4 = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImage4.setImageResource(drawableResource4)

        /* val resultText: TextView = findViewById(R.id.result_text)

         resultText.text = randomInt.toString()

         val resultText: TextView = findViewById(R.id.result_text)
         resultText.text = "Dice Rolled!"

        Toast.makeText(this, "button clicked",
             Toast.LENGTH_SHORT).show()*/

    }

    private fun plusDice2() {


        binding.apply {
            diceImage2.visibility = View.VISIBLE
            plusButton2.visibility = View.GONE
            minusButton2.visibility = View.VISIBLE
            plusButton3.visibility = View.VISIBLE
        }

        /* val noCube1 = when {
             binding.diceImage1.visibility.
         }*/

        /* val resultText: TextView = findViewById(R.id.result_text)
         /* if (resultText.text == "Hello World!"){
              resultText.text = "1"
          } else{*/
              var resultInt = resultText.text.toString().toInt()

              if (resultInt < 6) {
                  resultInt++
                  resultText.text = resultInt.toString()
              }
          }*/

    }

    private fun plusDice3() {

        binding.apply {
            diceImage3.visibility = View.VISIBLE
            plusButton3.visibility = View.GONE
            minusButton2.visibility = View.GONE
            minusButton3.visibility = View.VISIBLE
            plusButton4.visibility = View.VISIBLE
        }
    }

    private fun plusDice4() {

        binding.apply {
            diceImage4.visibility = View.VISIBLE
            plusButton4.visibility = View.GONE
            minusButton3.visibility = View.GONE
            minusButton4.visibility = View.VISIBLE
        }
    }

    private fun minusDice2() {

        binding.apply {
            diceImage2.visibility = View.GONE
            minusButton2.visibility = View.GONE
            plusButton3.visibility = View.GONE
            plusButton2.visibility = View.VISIBLE
        }
    }

    private fun minusDice3() {

        binding.apply {
            diceImage3.visibility = View.GONE
            minusButton3.visibility = View.GONE
            plusButton3.visibility = View.VISIBLE
            minusButton2.visibility = View.VISIBLE
            plusButton4.visibility = View.GONE
        }
    }

    private fun minusDice4() {

        binding.apply {
            diceImage4.visibility = View.GONE
            minusButton4.visibility = View.GONE
            plusButton4.visibility = View.VISIBLE
            minusButton3.visibility = View.VISIBLE
        }
    }


    private fun resetDice() {

        binding.diceImage1.setImageResource(R.drawable.dice_1)

        binding.diceImage2.visibility = View.GONE

        binding.diceImage3.visibility = View.GONE

        binding.diceImage4.visibility = View.GONE

        binding.apply{

            plusButton4.visibility = View.GONE
            plusButton3.visibility = View.GONE
            minusButton4.visibility = View.GONE
            minusButton3.visibility = View.GONE
            minusButton2.visibility = View.GONE

            plusButton2.visibility = View.VISIBLE

        }
    }

}