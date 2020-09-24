package com.myanmaritc.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.myanmaritc.myfirstapp.viewmodel.CountViewModel
import kotlinx.android.synthetic.main.activity_viewmodel.*

class ViewmodelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)
        var countViewModel =ViewModelProvider(this).get(CountViewModel::class.java)
        txtVMCount.text=countViewModel.getCount().toString()

        btnVMCount.setOnClickListener{
            var count=txtVMCount.text.toString().toInt()
            countViewModel.setCount(count)
            txtVMCount.text=countViewModel.getCount().toString()
        }
    }
}