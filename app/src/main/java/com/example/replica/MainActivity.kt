package com.example.replica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottone = findViewById<Button>(R.id.button)
        bottone.setOnClickListener{
            var intent = Intent(this, MainActivity2 :: class.java)
            startActivity(intent)
        }
    }
}