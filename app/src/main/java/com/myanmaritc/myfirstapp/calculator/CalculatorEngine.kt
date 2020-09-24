package com.myanmaritc.myfirstapp.calculator

import androidx.lifecycle.ViewModel

class CalculatorEngine:ViewModel() {
private var num1:Double=0.0
    private var num2:Double=0.0
    private  var result:Double=0.0
    fun setAddResult(num1:Double,num2:Double):Double{
        result= num1+num2
        return result

    }
    fun getAddResult():Double=result

    fun setSubResult(num1:Double,num2:Double):Double{
        result= num1-num2
        return result

    }
    fun getSubResult():Double=result

    fun setMulResult(num1:Double,num2:Double):Double{
        result= num1*num2
        return result

    }
    fun getMulResult():Double=result

    fun setDivResult(num1:Double,num2:Double):Double{
        result= num1/num2
        return result

    }
    fun getDivResult():Double=result
}