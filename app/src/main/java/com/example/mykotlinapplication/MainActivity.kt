package com.example.mykotlinapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val messageTextView = findViewById<TextView>(R.id.messageTextView)


        val name = "Hello World Nikhil Ravuri"


        val message = if (name.isNotBlank()) {
            "Hello Android $name"
        } else {
            "Hello World"
        }

        messageTextView.text = message
    }
}