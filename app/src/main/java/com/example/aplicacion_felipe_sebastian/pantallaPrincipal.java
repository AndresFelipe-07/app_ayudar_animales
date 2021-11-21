package com.example.aplicacion_felipe_sebastian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class pantallaPrincipal extends AppCompatActivity {

    CircleImageView cuenta,tomarFoto,bt1,imagenUsuario;
    TextView nombreUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        cuenta         = findViewById(R.id.cuenta);
        tomarFoto      = findViewById(R.id.tomarFoto);
        bt1            = findViewById(R.id.btn1);
        imagenUsuario  = findViewById(R.id.imagenUsuario);
        nombreUsuario  = findViewById(R.id.nombreUsuario);


    }//fin onCreate



}