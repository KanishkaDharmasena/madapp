package com.example.nsbm_papers_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class secondbusi : AppCompatActivity() {

    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondbusi)

        btn2=findViewById(R.id.button5)

        btn2.setOnClickListener {
            val intent = Intent(this@secondbusi, secondbusiview::class.java)
            startActivity(intent)
        }
    }
}