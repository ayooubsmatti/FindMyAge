package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonId.setOnClickListener{
            val yearOfBirth:Int = editText.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val age = "Your age is : ${currentYear-yearOfBirth}"
            textView.text=age
        }
    }
}
