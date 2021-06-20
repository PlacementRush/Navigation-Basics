package com.example.navigationbasics

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navigate(view: View){
        // On button click this function will be executed

        val editText = findViewById<EditText>(R.id.message)
        val message = editText.text.toString()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("message", message)
        startActivity(intent)

    }
}
