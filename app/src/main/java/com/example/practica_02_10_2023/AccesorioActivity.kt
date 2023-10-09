package com.example.practica_02_10_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AccesorioActivity : AppCompatActivity() {

    //intancia
    private lateinit var descripcion: TextView
    private lateinit var imagen: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accesorio)

        //Asociar con elemento grafico
         descripcion = findViewById(R.id.txtDescripcion)
         imagen = findViewById(R.id.imgAccesorioDetalle)
        //Instancia para recibir datos de fragment
        val infoRecibida = intent.extras
        //Variables para recibir los datos
        val detalle: String?
        val costo: String?
        val num: Int?
        //Validar si recibe informacion
        if(infoRecibida != null){
            //Recibir los datos del accesorio
            detalle = infoRecibida.getString("detalle")
            costo = infoRecibida.getString("costo")
            num = infoRecibida.getInt("numAccesorio")
            //Colocar en TextView
            descripcion.text = "Descripcion del producto:\n${detalle}\nCosto: ${costo}\n"
            //Cambio de imagen
            when(num){
                1 -> imagen.setImageResource(R.drawable.accesorio01)
                2 -> imagen.setImageResource(R.drawable.accesorio02)
                3 -> imagen.setImageResource(R.drawable.accesorio03)
                4 -> imagen.setImageResource(R.drawable.accesorio04)
                5 -> imagen.setImageResource(R.drawable.accesorio05)
                6 -> imagen.setImageResource(R.drawable.accesorio06)
                7 -> imagen.setImageResource(R.drawable.accesorio07)
                8 -> imagen.setImageResource(R.drawable.accesorio08)
                9 -> imagen.setImageResource(R.drawable.accesorio09)
                10 -> imagen.setImageResource(R.drawable.accesorio10)
            }
        }else{
            detalle = "Sin detalle"
            costo = "$0.00"
            num=1
            //Colocar en Text View
            descripcion.text = "Descripcion del producto: \n${detalle}\nCosto: ${costo}"
        }
    }//onCreate
}