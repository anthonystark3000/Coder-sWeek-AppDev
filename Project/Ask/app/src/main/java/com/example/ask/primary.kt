package com.example.ask

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.first.*
//import android.content.Intent as Intent1

class primary : AppCompatActivity() {
   // val res = intent.getIntExtra("result", 0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first)

        button2.setOnClickListener {
            var res = intent.getIntExtra("result", 0)
            res++
            Toast.makeText(applicationContext, res.toString(), Toast.LENGTH_SHORT).show()
            val intent = Intent(this, one::class.java)
              intent.putExtra("result", res);
        startActivity(intent)}


        }
    }
