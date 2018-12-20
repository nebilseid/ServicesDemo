package com.example.taetraining.servicesdemo

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import java.util.*

class MyBoundService : Service(){

    val binder = LocalBinder()
    var counter: Int =0
    override fun onBind(intent: Intent?): IBinder? {
        return binder
    }
    private fun startCounter(){
        val timerTask = object : TimerTask(){
            override fun run() {
                 
            }

        }
    }
    fun getCounterValue(): Int {

    }
    inner class LocalBinder:Binder(){
        fun getService():MyBoundService{
            return this@MyBoundService
        }
    }

}