package com.example.nsbm_papers_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class selector : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selector)

        btn1=findViewById(R.id.button)

        btn1.setOnClickListener {
            val intent = Intent(this@selector, secondcomp::class.java)
            startActivity(intent)
        }

        btn2=findViewById(R.id.button3)

        btn2.setOnClickListener {
            val intent = Intent(this@selector, secondengine::class.java)
            startActivity(intent)
        }

        btn3=findViewById(R.id.button4)

        btn3.setOnClickListener {
            val intent = Intent(this@selector, secondbusi::class.java)
            startActivity(intent)
        }
    }


}