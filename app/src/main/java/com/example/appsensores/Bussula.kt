package com.example.appsensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bussula.*

class Bussula : AppCompatActivity(), SensorEventListener {

    var sensor: Sensor? = null
    var sensorManage: SensorManager?=null
    var valorBussula: Float? =null

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }
    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null) {
            valorBussula = event!!.values[0]
        }
        Mag.text = valorBussula.toString()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bussula)

        sensorManage = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensor = sensorManage!!.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD)

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
