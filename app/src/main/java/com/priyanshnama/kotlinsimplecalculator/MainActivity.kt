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
        val str1 = number1.text.toString()
        val num1:Int
        if(str1.matches("-?\\d+(\\.\\d+)?".toRegex())){
            num1 = str1.toInt()
        }
        else{
            textView.text = "Enter something valid"
            return
        }

        val str2 = number2.text.toString()
        val num2:Int
        if(str2.matches("-?\\d+(\\.\\d+)?".toRegex())){
            num2 = str1.toInt()
        }
        else{
            textView.text = "Enter something valid"
            return
        }

        val result = num1 + num2
        textView.text = "" + result
    }

    fun subtract(view: View){
        val str1 = number1.text.toString()
        val num1:Int
        if(str1.matches("-?\\d+(\\.\\d+)?".toRegex())){
            num1 = str1.toInt()
        }
        else{
            textView.text = "Enter something valid"
            return
        }

        val str2 = number2.text.toString()
        val num2:Int
        if(str2.matches("-?\\d+(\\.\\d+)?".toRegex())){
            num2 = str1.toInt()
        }
        else{
            textView.text = "Enter something valid"
            return
        }
        val result = num1 - num2
        textView.text = "" + result
    }

    fun multiply(view: View){
        val str1 = number1.text.toString()
        val num1:Int
        if(str1.matches("-?\\d+(\\.\\d+)?".toRegex())){
            num1 = str1.toInt()
        }
        else{
            textView.text = "Enter something valid"
            return
        }

        val str2 = number2.text.toString()
        val num2:Int
        if(str2.matches("-?\\d+(\\.\\d+)?".toRegex())){
            num2 = str1.toInt()
        }
        else{
            textView.text = "Enter something valid"
            return
        }
        val result = num1 * num2
        textView.text = "" + result
    }

    fun divide(view: View){
        val str1 = number1.text.toString()
        val num1:Int
        if(str1.matches("-?\\d+(\\.\\d+)?".toRegex())){
            num1 = str1.toInt()
        }
        else{
            textView.text = "Enter something valid"
            return
        }

        val str2 = number2.text.toString()
        val num2:Int
        if(str2.matches("-?\\d+(\\.\\d+)?".toRegex())){
            num2 = str1.toInt()
        }
        else{
            textView.text = "Enter something valid"
            return
        }
        val result: Double
        result = (num1 / num2) * 1.00
        textView.text = "" + result
    }
}
