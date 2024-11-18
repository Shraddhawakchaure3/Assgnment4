package com.example.textview


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Button 1: Increment counter and display the value in TextView
        button1.setOnClickListener {
            counter++
            textView.text = "Counter: $counter"
        }

        // Button 2: Change the height of TextView
        button2.setOnClickListener {
            val newHeight = 300 // Set new height in pixels
            val layoutParams = textView.layoutParams
            layoutParams.height = newHeight
            textView.layoutParams = layoutParams
        }

        // Button 3: Center the text on the screen
        button3.setOnClickListener {
            val layoutParams = textView.layoutParams as ViewGroup.MarginLayoutParams
            layoutParams.topMargin = 0
            layoutParams.bottomMargin = 0
            layoutParams.leftMargin = 0
            layoutParams.rightMargin = 0
            textView.layoutParams = layoutParams
            textView.gravity = Gravity.CENTER
        }
    }
}