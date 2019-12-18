package com.priyanshnama.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

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

        val ind1 = str1.indexOf('.')
        val ind2 = str2.indexOf('.')

        val len1 = str1.length
        val len2 = str2.length

        val scale1 = len1 - (ind1 + 1)
        val scale2 = len2 - (ind2 + 1)

        val scale : Int
        if(scale1 > scale2)
            scale = scale1
        else
            scale = scale2

        val res = num1 - num2
        val result = BigDecimal(res).setScale(scale, RoundingMode.HALF_EVEN)
        println("$num1 - $num2 = $result process: len1=$len1 len2=$len2 ind1=$ind1 ind2=$ind2 scale1:$scale1 scale2:$scale2 scale:$scale")
        textView.text = "" + result
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

        val ind1 = str1.indexOf('.')
        val ind2 = str2.indexOf('.')

        val len1 = str1.length
        val len2 = str2.length

        val scale1 = len1 - (ind1 + 1)
        val scale2 = len2 - (ind2 + 1)

        val scale = scale1 + scale2
        val res = num1 * num2
        val result = BigDecimal(res).setScale(scale, RoundingMode.HALF_EVEN)
        println("$num1 - $num2 = $result process: len1=$len1 len2=$len2 ind1=$ind1 ind2=$ind2 scale1:$scale1 scale2:$scale2 scale:$scale")
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
