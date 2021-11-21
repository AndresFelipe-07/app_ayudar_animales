package com.example.aplicacion_felipe_sebastian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class registro extends AppCompatActivity {

   private EditText nombre,correoRegistro,contrasenaRegistro,contrasenaRepetidaRegistro;
   private Button botonRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        nombre                      = findViewById(R.id.nombre);
        correoRegistro              = findViewById(R.id.correoRegistro);
        contrasenaRegistro          = findViewById(R.id.contraseñaRegistro);
        contrasenaRepetidaRegistro  = findViewById(R.id.contraseñaRepetidaRegistro);
        botonRegistrarse            = findViewById(R.id.BotonRegistrarse);


    }// fin onCreate


}