package com.example.diceroller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    lateinit var HelloImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstbutton: Button = findViewById(R.id.button1)
        firstbutton.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT ).show()
            changetext()

        }
        HelloImage = findViewById(R.id.dice_image1)
    }

    private fun changetext()
    {
        val text1 : TextView = findViewById(R.id.text1)
        val randomInt = java.util.Random().nextInt(6)+1
        text1.text = randomInt.toString()
        val drawableResource = when(randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceimage : ImageView = findViewById(R.id.dice_image1)
        diceimage.setImageResource(drawableResource)
    }
}


