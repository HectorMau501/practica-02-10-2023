package com.example.practica_02_10_2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class ingreso : AppCompatActivity() {

    //Instancias
    private lateinit var email: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)

        //Asociar instancias con componentes graficos
        email = findViewById(R.id.editCorreo)
        password = findViewById(R.id.editContrasena)
    }//onCreate

    fun onClick(view: View?){
        when(view?.id){
            R.id.btnAceptar -> aceptar()
            R.id.btnCancelar -> cancelar()
        }
    }//onClick

    private fun aceptar() {
        //validar que las cajas de texto no esten vacias o con espacios en blanco
        if(email.text.isNotEmpty() && email.text.isNotBlank() &&
            password.text.isNotEmpty() && password.text.isNotBlank()){
            //validar si los datos son correctos
            if(email.text.toString() == "usr" && password.text.toString() == "12345"){
                //Regresar al menu principal
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Correo o Contraseña incorrecto.",Toast.LENGTH_SHORT).show()
            }//if-else
        }else{
            Toast.makeText(this,"Ingresar Informacion.",Toast.LENGTH_SHORT).show()
        }
    }//aceptar

    private fun cancelar() {
        Toast.makeText(this,"Termina la aplicación.",Toast.LENGTH_SHORT).show()
        finish()
    }//cancelar
}