 package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNum = findViewById<EditText>(R.id.number1)
        val secondNum = findViewById<EditText>(R.id.number2)
        val answer = findViewById<TextView>(R.id.answer)
        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val multiply = findViewById<Button>(R.id.multiply)
        val divide = findViewById<Button>(R.id.divide)

        plus.setOnClickListener {
            val num1 = firstNum.text.toString().toDouble()
            val num2 = secondNum.text.toString().toDouble()
            val ans = num1 + num2
            answer.text = ans.toString()
        }
        minus.setOnClickListener {
            val num1 = firstNum.text.toString().toDouble()
            val num2 = secondNum.text.toString().toDouble()
            val ans = num1 - num2
            answer.text = ans.toString()
        }
        multiply.setOnClickListener {
            val num1 = firstNum.text.toString().toDouble()
            val num2 = secondNum.text.toString().toDouble()
            val ans = num1 * num2
            answer.text = ans.toString()
        }
        divide.setOnClickListener {
            val num1 = firstNum.text.toString().toDouble()
            val num2 = secondNum.text.toString().toDouble()
            val ans = num1 / num2
            answer.text = ans.toString()
        }
    }
}