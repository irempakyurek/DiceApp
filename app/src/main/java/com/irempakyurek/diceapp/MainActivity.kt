package com.irempakyurek.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceOne : ImageView = findViewById(R.id.dice_one)
        val diceTwo : ImageView = findViewById(R.id.dice_two)

        val roll : Button = findViewById(R.id.roll_dice)
        val clear : Button = findViewById(R.id.clear_dice)

        roll.setOnClickListener {

            Toast.makeText(this@MainActivity, "Zar Atıldı..", Toast.LENGTH_SHORT).show()

            val randomNum = (1..6).random()
            val randomNum2 = (1..6).random()

            when(randomNum){
                1 -> diceOne.setImageResource(R.drawable.dice_1)
                2 -> diceOne.setImageResource(R.drawable.dice_2)
                3 -> diceOne.setImageResource(R.drawable.dice_3)
                4 -> diceOne.setImageResource(R.drawable.dice_4)
                5 -> diceOne.setImageResource(R.drawable.dice_5)
                6 -> diceOne.setImageResource(R.drawable.dice_6)
            }

            when(randomNum2){
                1 -> diceTwo.setImageResource(R.drawable.dice_1)
                2 -> diceTwo.setImageResource(R.drawable.dice_2)
                3 -> diceTwo.setImageResource(R.drawable.dice_3)
                4 -> diceTwo.setImageResource(R.drawable.dice_4)
                5 -> diceTwo.setImageResource(R.drawable.dice_5)
                6 -> diceTwo.setImageResource(R.drawable.dice_6)
            }
        }

        clear.setOnClickListener {
            diceOne.setImageResource(R.drawable.empty_dice)
            diceTwo.setImageResource(R.drawable.empty_dice)
        }
    }
}