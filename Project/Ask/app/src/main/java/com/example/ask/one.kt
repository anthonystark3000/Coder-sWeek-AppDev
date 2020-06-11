package com.example.ask

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.one.*

class one : AppCompatActivity() {
    var res = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.one)
        button3.setOnClickListener {
        }
        button4.setOnClickListener {
        }
        button5.setOnClickListener {
        }
        button6.setOnClickListener {
            res++
            Toast.makeText(applicationContext,res.toString(),Toast.LENGTH_SHORT).show()

        }    }

}