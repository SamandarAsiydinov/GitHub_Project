package com.example.github_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myFun()
    }

    private fun myFun() {
        val btnSecond = findViewById<Button>(R.id.btn_open_second)
        btnSecond.text = getString(R.string.open_second)
        btnSecond.textSize = 17f
        btnSecond.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}