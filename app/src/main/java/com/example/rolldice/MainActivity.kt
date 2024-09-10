package com.example.rolldice

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.rolldice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollDice.setOnClickListener{
            rollDice()
        }
    }

    fun rollDice(){

        val randomNumber = Random.nextInt(6)+1
        val displayDice = when(randomNumber){
            1 -> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        binding.DiceImg.setImageResource(displayDice)
        Toast.makeText(this, "Rolled a $randomNumber!", Toast.LENGTH_SHORT).show()
    }
}