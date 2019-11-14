package com.example.appsensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ver_sensores.*

class verSensores : AppCompatActivity() {

    lateinit var sensorManager: SensorManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_sensores)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
//        //val deviceSensors: List<Sensor> = sensorManager.getSensorList(Sensor.TYPE_ALL)

        if(sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)!=null){
            Luz.text = "Sim"
        }else{
            Luz.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE)!=null){
            Giroscopio.text = "Sim"
        }else{
            Giroscopio.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD)!=null){
            Magneton.text = "Sim"
        }else{
            Magneton.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)!=null){
            Acelerometro.text = "Sim"
        }else{
            Acelerometro.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY)!=null){
            Gravidade.text = "Sim"
        }else{
            Gravidade.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION)!=null){
            Orientacao.text = "Sim"
        }else{
            Orientacao.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE)!=null){
            Pressao.text = "Sim"
        }else{
            Pressao.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY)!=null){
            Proximidade.text = "Sim"
        }else{
            Proximidade.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_TEMPERATURE)!=null){
            Temperatura.text = "Sim"
        }else{
            Temperatura.text = "Não"
        }
        if (sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)!=null){
            TemperaturaAmbi.text = "Sim"
        }else{
            TemperaturaAmbi.text = "Não"
        }
    }
}
