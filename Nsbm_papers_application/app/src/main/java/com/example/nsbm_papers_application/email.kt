package com.example.nsbm_papers_application

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class email : AppCompatActivity() {
    private lateinit var TextView5: TextView
    private lateinit var TextView7: TextView
    private lateinit var TextView9: TextView
    private lateinit var TextView11: TextView
    private lateinit var TextView13: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)


        TextView5=findViewById(R.id.textView5)
        TextView5.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://sob@nsbm.ac.lk/"))
            startActivity(i)
        }
        TextView7=findViewById(R.id.textView7)
        TextView7.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://soc@nsbm.ac.lk/"))
            startActivity(i)
        }
        TextView9=findViewById(R.id.textView9)
        TextView9.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://infoeng@nsbm.ac.lk/"))
            startActivity(i)
        }
        TextView11=findViewById(R.id.textView11)
        TextView11.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://examinations@nsbm.ac.lk/"))
            startActivity(i)
        }
        TextView13=findViewById(R.id.textView13)
        TextView13.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://library@nsbm.ac.lk/"))
            startActivity(i)
        }

    }
}