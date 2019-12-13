package com.priyanshnama.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View){
        val num1 = number1.text.toString().toInt()
        val num2 = number2.text.toString().toInt()
        val result = num1 + num2
        textView.text = "" + result
    }

    fun subtract(view: View){
        val num1 = number1.text.toString().toInt()
        val num2 = number2.text.toString().toInt()
        val result = num1 - num2
        textView.text = "" + result
    }

    fun multiply(view: View){
        val num1 = number1.text.toString().toInt()
        val num2 = number2.text.toString().toInt()
        val result = num1 * num2
        textView.text = "" + result
    }

    fun divide(view: View){
        val num1 = number1.text.toString().toDouble()
        val num2 = number2.text.toString().toDouble()
        val result: Double
        result = num1 / num2
        textView.text = "" + result
    }
}
