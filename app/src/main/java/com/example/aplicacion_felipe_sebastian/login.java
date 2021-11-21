package com.example.aplicacion_felipe_sebastian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

   private EditText correo,contrasena;
   private Button aceptar,registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        correo     = findViewById(R.id.correo);
        contrasena = findViewById(R.id.contraseña);
        aceptar    = findViewById(R.id.aceptar);
        registro   = findViewById(R.id.registro);

    registro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(login.this,pantallaPrincipal.class);
            startActivity(i);
        }
    });

    }//fin oncreate



}