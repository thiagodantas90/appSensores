package com.example.appsensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_proximidade.*

class Proximidade : AppCompatActivity(), SensorEventListener{

    var sensor: Sensor?=null
    var sensorManage: SensorManager?=null

    var valorSensor:Float?=null

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null){
            valorSensor = event.values[0]
        }
        proxValor.text = valorSensor.toString()

        if (valorSensor!!<2){
            statusSensor.text = "Perto"
        }else{
            statusSensor.text = "Longe"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proximidade)

        sensorManage = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensor = sensorManage!!.getDefaultSensor(Sensor.TYPE_PROXIMITY)

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
