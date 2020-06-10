package com.uabc.edu.registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            button.setOnClickListener {
              val intento = Intent(this, DisplayMessageActivity ::class.java)
                intento.putExtra("nombre", etNombre.text.toString())
                intento.putExtra("paterno", etPaterno.text.toString())
                intento.putExtra("materno", etMaterno.text.toString())
                intento.putExtra("edad", etEdad.text.toString())
                intento.putExtra("correo", etCorreo.text.toString())
                startActivity(intento)

            }

    }

    


}


