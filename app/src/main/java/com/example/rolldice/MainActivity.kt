package com.example.rolldice

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDice: Button = findViewById(R.id.roll_dice)

        btnDice.setOnClickListener {
           rollDice()
        }
    }

    fun rollDice(){
        val viewDice: ImageView = findViewById(R.id.Dice_img)
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
        viewDice.setImageResource(displayDice)
        Toast.makeText(this, "Rolled a $randomNumber!", Toast.LENGTH_SHORT).show()
    }
}