package com.example.ibookholiday5.kotlinbasicsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }


    fun showRandomNumber(){

        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        //Generate the random number
        val random = Random()
        var randomInt = 0

        if(count > 0){
            randomInt = random.nextInt(count + 1)

        }

        val showRandomText = findViewById(R.id.textview_random) as TextView
        val showTextView = findViewById(R.id.textview_label) as TextView



        // Display the random number.
        showRandomText.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        showTextView.text = getString(R.string.random_heading, count)
    }
}
