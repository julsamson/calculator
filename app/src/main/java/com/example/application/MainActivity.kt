package com.example.application

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var answer = findViewById<EditText>(R.id.total)
        var sum = findViewById<Button>(R.id.sum)
        var sub = findViewById<Button>(R.id.diff)
        var product = findViewById<Button>(R.id.product)
        var div = findViewById<Button>(R.id.divide)

        sum.setOnClickListener{

            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1 + addnum2


            answer.setText("The Sum is: $result")
            Toast.makeText(this, "Answered given", Toast.LENGTH_SHORT).show()
        }

        //substraction operation done here
        sub.setOnClickListener{

            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1 - addnum2

            answer.setText("The Difference is: $result")
            Toast.makeText(this, "Answered given", Toast.LENGTH_SHORT).show()
        }

        //Multiplication operation done here
        product.setOnClickListener{

            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1 * addnum2

            answer.setText("The Product is: $result")
            Toast.makeText(this, "Answered given", Toast.LENGTH_SHORT).show()
        }

        //Division operation done here
        div.setOnClickListener{

            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()

            if (addnum2 == 0){
                answer.setText("Error: can't divide by 0")
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
            else{
                var result = addnum1 / addnum2

                answer.setText("The Divisible is: $result")
                Toast.makeText(this, "Answered given", Toast.LENGTH_SHORT).show()
            }

        }

    }

}