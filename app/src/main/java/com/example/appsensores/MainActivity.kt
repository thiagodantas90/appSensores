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

    var i = Intent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGiroscopio.setOnClickListener(){
            i = Intent(this,Giroscopio::class.java)
            startActivity(i)
        }
        btnBussula.setOnClickListener(){
            i = Intent(this, Bussula::class.java)
            startActivity(i)
        }
        btnLigh.setOnClickListener(){
            i = Intent(this, Luminosidade::class.java)
            startActivity(i)
        }
        btnAcelerometro.setOnClickListener(){
            i = Intent(this, Acelerometro::class.java)
            startActivity(i)
        }
        btnVerSensores.setOnClickListener(){
            i = Intent(this, verSensores::class.java)
            startActivity(i)
        }
        btnAproximacao.setOnClickListener(){
            i = Intent(this, Proximidade::class.java)
            startActivity(i)
        }


    }

}
