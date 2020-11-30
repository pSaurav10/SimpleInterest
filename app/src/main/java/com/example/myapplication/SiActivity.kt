package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class SiActivity : AppCompatActivity() {


    private lateinit var etPrincipal: EditText
    private lateinit var etRate: EditText
    private lateinit var etTime: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvInterest: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_si)

        etPrincipal = findViewById(R.id.etPrincipal)
        etRate = findViewById(R.id.etRate)
        etTime = findViewById(R.id.etTime)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvInterest = findViewById(R.id.tvInterest)


        btnCalculate.setOnClickListener {
            if(checkEmptyValues()){
                getValues()}
        }
    }

    private fun checkEmptyValues(): Boolean{
        var flag = true
        if(TextUtils.isEmpty(etPrincipal.text)){
            etPrincipal.error = "Please enter the Principal Amount"
            etPrincipal.requestFocus()
            flag = false
        }
        else if(TextUtils.isEmpty(etRate.text)){
            etRate.error = "Please enter the rate"
            etRate.requestFocus()
            flag = false
        }
        else if(TextUtils.isEmpty(etTime.text)) {
            etTime.error = "Please enter "
            etTime.requestFocus()
            flag = false
        }
        return flag
    }
    private fun getValues(){
        val principal = etPrincipal.text.toString().toInt()
        val rate = etRate.text.toString().toInt()
        val time = etTime.text.toString().toInt()
        var simpleInterest: Int = (principal * rate * time) / 100
        tvInterest.text = simpleInterest.toString()
    }


}