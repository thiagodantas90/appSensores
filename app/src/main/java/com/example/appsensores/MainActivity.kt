package com.example.appsensores

import android.content.Context
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.io.IOException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGiroscopio.setOnClickListener(){
            var i = Intent(this,Giroscopio::class.java)
            startActivity(i)
        }
        btnBussula.setOnClickListener(){
            var i = Intent(this, Bussula::class.java)
            startActivity(i)
        }

    }

}
