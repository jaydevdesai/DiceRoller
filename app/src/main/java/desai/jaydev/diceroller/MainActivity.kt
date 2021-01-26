package desai.jaydev.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollBtn)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImageView: ImageView = findViewById(R.id.diceIMG)
        when (diceRoll) {
            1 -> diceImageView.setImageResource(R.drawable.dice_1)
            2 -> diceImageView.setImageResource(R.drawable.dice_2)
            3 -> diceImageView.setImageResource(R.drawable.dice_3)
            4 -> diceImageView.setImageResource(R.drawable.dice_4)
            5 -> diceImageView.setImageResource(R.drawable.dice_5)
            6 -> diceImageView.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}