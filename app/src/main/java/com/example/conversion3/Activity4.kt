package com.example.conversion3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        var textAnswer=findViewById<TextView>(R.id.textView2)
        var dataIntent=this.intent
        textAnswer.text=dataIntent.getDoubleExtra("answer",-1.0).toString()
    }
}