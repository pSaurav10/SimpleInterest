package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class ImageActivity : AppCompatActivity() {

    private lateinit var  rbAndroid : RadioButton
    private lateinit var rbIos : RadioButton
    private lateinit var rbPsyche: RadioButton
    private lateinit var imgProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        
    }
}