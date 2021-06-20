package com.example.navigationbasics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("message")

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = message
    }
}
