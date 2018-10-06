package com.kotlin.order.coffee.cafew32

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun ordenartaza(View: View){
        var txtnrotazas : TextView =  findViewById<TextView>(R.id.txtnrotaza)
        var resultado : TextView =  findViewById<TextView>(R.id.txtresultado)

        resultado.setText("usted ordeno ${txtnrotazas.text}")

    }

}
