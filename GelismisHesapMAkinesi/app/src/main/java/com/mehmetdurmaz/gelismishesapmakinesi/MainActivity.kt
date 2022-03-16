package com.mehmetdurmaz.gelismishesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toplama(view: View){
        var a=firstNum.text.toString().toInt()
        var b=seconderNum.text.toString().toInt()
        var  c:Int=a+b

        textView.setText("Sonuç: "+c.toString() )

    }
    fun cikar(view:View){
        var a=firstNum.text.toString().toInt()
        var b=seconderNum.text.toString().toInt()
        var c:Int=a-b
        c.toString()
        textView.setText("Sonuç: "+c.toString())

    }
    fun bol(view: View){
        var a=firstNum.text.toString().toInt()
        var b=seconderNum.text.toString().toInt()
        var büyük = Math.max(a,b)
        var kücuk = Math.min(a,b)
        var c:Int=büyük/kücuk

        textView.text= ("Sonuç: ${c}")
    }
    fun carp(view:  View){
        var a=firstNum.text.toString().toInt()
        var b=seconderNum.text.toString().toInt()
        var c=a*b
        textView.setText("Sonuç: "+c.toString())  }


    fun üs(view: View){
        var a=firstNum.text.toString().toInt()
        var b=seconderNum.text.toString().toInt()
        var result:Int=1
        for (i in 1..a){
            result*=b
            textView.setText("Sonuç: "+result.toString())
        }

    }
    fun mod (view: View){
        var a=firstNum.text.toString().toInt()
        var b=seconderNum.text.toString().toInt()
        var büyük = Math.max(a,b)
        var kücuk = Math.min(a,b)
        var c:Int=büyük%kücuk
        textView.setText("Sonuç: ${c}")
    }

}