package com.example.appsensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.io.IOException


class MainActivity : AppCompatActivity(), SensorEventListener{

    var sensor:Sensor? = null
    var sensorManage:SensorManager?=null
    var isRunning = false
    var valorGiroscopioX: Float? =null
    var valorGiroscopioY: Float? =null
    var valorGiroscopioZ: Float? =null

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null) {
            valorGiroscopioX = event!!.values[0]
            valorGiroscopioY = event!!.values[1]
            valorGiroscopioZ = event!!.values[2]
        }
        eixoX.text = valorGiroscopioX.toString()
        eixoY.text = valorGiroscopioY.toString()
        eixoZ.text = valorGiroscopioZ.toString()
//        try {
//            if(event!!.values[0]<30 && isRunning == false){
//                isRunning = true
//
//            }
//        }catch (e:IOException){
//
//        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sensorManage = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensor = sensorManage!!.getDefaultSensor(Sensor.TYPE_GYROSCOPE)


    }

    override fun onResume() {
        super.onResume()
        sensorManage?.registerListener(this,sensor, SensorManager.SENSOR_DELAY_NORMAL)
    }

    override fun onPause() {
        super.onPause()
        sensorManage?.unregisterListener(this)
    }

}
