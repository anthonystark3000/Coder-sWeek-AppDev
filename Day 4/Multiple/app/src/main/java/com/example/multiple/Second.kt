package com.example.multiple

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.acttwo.*

class Second : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acttwo)
        prev.setOnClickListener {
            val int = Intent(this, MainActivity::class.java)
            startActivity(int)
        }
    }

}

