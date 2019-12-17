package com.priyanshnama.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Double.parseDouble

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View){

        val str1 = number1.text.toString()
        val str2 = number2.text.toString()

        val num1:Double
        val num2:Double

        try {
            num1 = str1.toDouble()
            num2 = str2.toDouble()
        }
        catch (e: NumberFormatException) {
            textView.text = "Enter something valid"
            return
        }

        val result = num1 + num2
        println("$num1 + $num2 = $result")
        textView.text = "" + result
    }

    fun subtract(view: View){

        val str1 = number1.text.toString()
        val str2 = number2.text.toString()

        val num1:Double
        val num2:Double

        try {
            num1 = str1.toDouble()
            num2 = str2.toDouble()
        }
        catch (e: NumberFormatException) {
            textView.text = "Enter something valid"
            return
        }

        val result = num1 - num2
        println("$num1 - $num2 = $result")
        textView.text = "%.2f".format(result)
    }

    fun multiply(view: View){

        val str1 = number1.text.toString()
        val str2 = number2.text.toString()

        val num1:Double
        val num2:Double

        try {
            num1 = str1.toDouble()
            num2 = str2.toDouble()
        }
        catch (e: NumberFormatException) {
            textView.text = "Enter something valid"
            return
        }

        val result = num1 * num2
        println("$num1 * $num2 = $result")
        textView.text = "" + result
    }

    fun divide(view: View){

        val str1 = number1.text.toString()
        val str2 = number2.text.toString()

        val num1:Double
        val num2:Double

        try {
            num1 = str1.toDouble()
            num2 = str2.toDouble()
        }
        catch (e: NumberFormatException) {
            textView.text = "Enter something valid"
            return
        }

        val result: Double
        result = num1 / num2
        println("$num1 / $num2 = $result")
        textView.text = "" + result
    }
}
