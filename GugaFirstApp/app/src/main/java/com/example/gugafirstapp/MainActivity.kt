package com.example.gugafirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sumBtn.setOnClickListener {
            val firstOperand = firstVar.text.toString()
            val secondOperand = secondVar.text.toString()

            val sum = (firstOperand.toInt() + secondOperand.toInt()).toString()
            val intent = Intent(this, SumActivity::class.java)
            intent.putExtra("SUM", sum)
            startActivity(intent)
        }
    }
}
