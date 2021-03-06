package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.diceroll.R

/**This activity allows the user to roll the dice and view the results
 * on screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }
            /**
             * Roll the dice and update the screen
             */
            private fun rollDice() {
                // Create new dice object with six sides and roll it
                val dice = Dice(6)
                val diceRoll = dice.roll()
                val diceImage: ImageView = findViewById(R.id.imageView)

                val drawableResource = when (diceRoll) {
                    1->R.drawable.dice_1
                    2->R.drawable.dice_2
                    3->R.drawable.dice_3
                    4->R.drawable.dice_4
                    5->R.drawable.dice_5
                    else->R.drawable.dice_6
                }
                // Update the ImageView with the correct drawable resource Id
                diceImage.setImageResource(drawableResource)
                // Update the content description
                diceImage.contentDescription = diceRoll.toString()
            }
        }
class Dice(private val numSides: Int){
    fun roll(): Int {
        return (1..numSides).random()
    }
}
