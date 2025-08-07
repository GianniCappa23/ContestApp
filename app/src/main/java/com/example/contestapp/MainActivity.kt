package com.example.contestapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            score++
            scoreText.text = "Score: $score"
            Log.d("ContestApp", "Button 1 clicked. Score is now $score")
        }

        button2.setOnClickListener {
            score++
            scoreText.text = "Score: $score"
            Log.d("ContestApp", "Button 2 clicked. Score is now $score")
        }

        button3.setOnClickListener {
            score++
            scoreText.text = "Score: $score"
            Log.d("ContestApp", "Button 3 clicked. Score is now $score")
        }
    }
}
