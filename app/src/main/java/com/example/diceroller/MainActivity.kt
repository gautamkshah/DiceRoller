package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import java.util.Random as Random1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.rollbutton)
        rollbutton.text="Let's Roll"
        rollbutton.setOnClickListener(){
          //  Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            rollDice();

        }
    }

    private fun rollDice() {
       // val resulttext: TextView=findViewById(R.id.resulttext)
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val randomInt=Random.nextInt(6)+1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)


    }
}