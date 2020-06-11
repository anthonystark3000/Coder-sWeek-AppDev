package com.example.ask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var res = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var name: EditText
        name = findViewById(R.id.name)
        lateinit var age: EditText
        age = findViewById(R.id.Age)

        button.setOnClickListener {


                val user = name.text.toString()

                val old = age.text.toString()

                Toast.makeText(this, "Welcome $user", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, primary::class.java)
                intent.putExtra("result", res);

                startActivity(intent)



        }

    }


}
