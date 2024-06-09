package com.example.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.clickMeButton)
        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

        clickMeButton.setOnClickListener {
            val name = nameEditText.text.toString()
            if (name.isNotEmpty()) {
                val welcomeMessage = "Welcome, $name!"
                welcomeTextView.text = welcomeMessage
            } else {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
