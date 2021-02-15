package com.example.conversion3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText

class Activity2 : AppCompatActivity() {
        var finalresult:Double=0.0
        lateinit var inputText: EditText
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
     if(resultCode== Activity.RESULT_OK){
         if(requestCode==1234){
             var select_unit=data!!.getStringExtra("data")
             when(select_unit){
                 "kb"-> finalresult=inputText.text.toString().toInt()/1000.0
                 "mb"-> finalresult=inputText.text.toString().toInt()/1000000.0
                 "gb"-> finalresult=inputText.text.toString().toInt()/10000000000.0
             }
    // Log.v("answer",finalresult.toString())   /*คำตอบโชว์ใน logcat*/
             var activity4Intent=Intent(this,Activity4::class.java)
             activity4Intent.putExtra("answer",finalresult)
             startActivity(activity4Intent)
         }
     }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.fade_in,R.anim.slide_up)
        setContentView(R.layout.activity_2)
    var animationBlink= AnimationUtils.loadAnimation(this,R.anim.blink) /*lihkให้ปุ่มมีลูกเล่น*/
    var animationRotate=AnimationUtils.loadAnimation(this,R.anim.rotate)
     var BtnSelect=findViewById<Button>(R.id.button)
     var ShowAN=findViewById<Button>(R.id.button2)
        ShowAN.startAnimation(animationRotate)
        BtnSelect.startAnimation(animationBlink) /*แสดงให้ปุ่มมีลูกเล่น*/
    inputText=findViewById(R.id.editTextNumber)



        BtnSelect.setOnClickListener {
           var activity2Intent= Intent(this,Activity3::class.java)
            startActivityForResult(activity2Intent,1234)

        }
    }

}