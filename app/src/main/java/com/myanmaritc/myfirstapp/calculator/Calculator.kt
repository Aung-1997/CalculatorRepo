package com.myanmaritc.myfirstapp.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.myanmaritc.myfirstapp.R
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        var calculator=ViewModelProvider(this).get(CalculatorEngine ::class.java)
        var num1=txtOne.text.toString().toDouble()
        var num2=txtTwo.text.toString().toDouble()
        btnAdd.setOnClickListener {
            var out=calculator.setAddResult(num1,num2)
            txtOutput.text=calculator.getAddResult().toString()
        }
    }
}