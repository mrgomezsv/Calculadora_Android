package com.calculadora.app

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        darkOff()

        val btn1 : Button = findViewById(R.id.btn1)
        val btn2 : Button = findViewById(R.id.btn2)
        val btn3 : Button = findViewById(R.id.btn3)
        val btn4 : Button = findViewById(R.id.btn4)
        val btn5 : Button = findViewById(R.id.btn5)
        val btn6 : Button = findViewById(R.id.btn6)
        val btn7 : Button = findViewById(R.id.btn7)
        val btn8 : Button = findViewById(R.id.btn8)
        val btn9 : Button = findViewById(R.id.btn9)
        val btn0 : Button = findViewById(R.id.btn0)
        val btnPunto : Button = findViewById(R.id.btnPunto)

        btn1.setOnClickListener{ numeroPresionado("1")}
        btn2.setOnClickListener{ numeroPresionado("2")}
        btn3.setOnClickListener{ numeroPresionado("3")}
        btn4.setOnClickListener{ numeroPresionado("4")}
        btn5.setOnClickListener{ numeroPresionado("5")}
        btn6.setOnClickListener{ numeroPresionado("6")}
        btn7.setOnClickListener{ numeroPresionado("7")}
        btn8.setOnClickListener{ numeroPresionado("8")}
        btn9.setOnClickListener{ numeroPresionado("9")}
        btn0.setOnClickListener{ numeroPresionado("0")}
        btnPunto.setOnClickListener{ numeroPresionado(".")}
    }

    private fun numeroPresionado(digito: String){
        val resultadoTextView : TextView = findViewById(R.id.resultadoTextView)
        resultadoTextView.text = "${resultadoTextView.text}$digito"
    }

    private fun darkOff(){        ///////////OF MODE DARK/////////
        val nightModeFlags: Int =
            getResources().getConfiguration().uiMode and Configuration.UI_MODE_NIGHT_MASK
        when (nightModeFlags) {
            Configuration.UI_MODE_NIGHT_YES -> {
                /* si esta activo el modo oscuro lo desactiva */AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO
                )

            }
        }
    }
}