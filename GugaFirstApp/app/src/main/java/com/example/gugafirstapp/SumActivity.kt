package com.example.gugafirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sum.*

class SumActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)

        val intent = intent
        val sum = intent.getStringExtra("SUM")

        sumTv.text = "Sum is: $sum"
    }
}
