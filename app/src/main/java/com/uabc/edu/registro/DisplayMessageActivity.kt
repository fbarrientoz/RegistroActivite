package com.uabc.edu.registro

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val bundle = intent.extras
        val dato = bundle?.getString("nombre")
        val dato2 = bundle?.getString("paterno")
        val dato3 = bundle?.getString("materno")
        val dato4 = bundle?.getString("edad")
        val dato5 = bundle?.getString("correo")
        nombre.setText(dato)
        paterno.setText(dato2)
        materno.setText(dato3)
        edad2.setText(dato4)
        correo2.setText(dato5)
        button2.setOnClickListener { finish() }
        }
}
