package com.example.conversion3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.slide_up,R.anim.slide_up)
        setContentView(R.layout.activity_3)
    var BtnKb=findViewById<Button>(R.id.button3)
    var BtnMb=findViewById<Button>(R.id.button4)
    var BtnGb=findViewById<Button>(R.id.button5)
    var IntentData= Intent()
    BtnKb.setOnClickListener {
        IntentData.putExtra("data", "kb")
        setResult(Activity.RESULT_OK, IntentData)
        finish()                                    /*เซตค่าให้โปรแกรมรู้ว่าไม่ได้จบการทำงาน*/
    }
    BtnMb.setOnClickListener {
        IntentData.putExtra("data", "mb")
        setResult(Activity.RESULT_OK, IntentData)
        finish()
    }
    BtnGb.setOnClickListener {
            IntentData.putExtra("data","gb")
            setResult(Activity.RESULT_OK,IntentData)
            finish()
    }
    }
}