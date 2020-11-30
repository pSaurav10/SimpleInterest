package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import javax.security.auth.Subject

class MainActivity : AppCompatActivity() {


    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var rdoAdd: RadioButton
    private lateinit var rdoSubtract: RadioButton
    private lateinit var rdoMultiply: RadioButton
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)
        rdoAdd = findViewById(R.id.rdoAdd)
        rdoSubtract = findViewById(R.id.rdoSubtract)
        rdoMultiply = findViewById(R.id.rdoMultiply)

        btnCalculate.setOnClickListener {
            if(checkEmptyValues()){
            getValues()}
//            val result: Int = add(first, second)
//            tvResult.text = result.toString()


        }
    }


    private fun checkEmptyValues(): Boolean{
        var flag = true
        if(TextUtils.isEmpty(etFirst.text)){
            etFirst.error = "Please enter first number"
            etFirst.requestFocus()
            flag = false
        }else if(TextUtils.isEmpty(etSecond.text)) {
            etSecond.error = "Please enter first number"
            etSecond.requestFocus()
            flag = false
        }
        return flag
    }

    private fun getValues(){
        val first = etFirst.text.toString().toInt()
        val second = etSecond.text.toString().toInt()
        var result: Int = 0
        if(rdoAdd.isChecked){
            result = first + second
        }
        else if(rdoSubtract.isChecked){
            result = first - second
        }
        else if(rdoMultiply.isChecked){
            result = first * second
        }
        tvResult.text = result.toString()
    }

//    function with return type
//    private fun add(first: Int, second: Int) :Int{
//        return first+second
//    }

//    function with no return type
//    private fun add(first: Int, second: Int) {
//        val result: Int = first + second
//        tvResult.text = result.toString()
//    }
}