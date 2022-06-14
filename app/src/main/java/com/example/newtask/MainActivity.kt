package com.example.newtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageObjects : MutableList<Images>  = mutableListOf()
        imageObjects.add(Images(R.drawable.shiv1,"SHIV"))


        viewPage.adapter = viewPagerAdapter(imageObjects)




    }

}