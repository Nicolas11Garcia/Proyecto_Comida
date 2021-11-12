package com.example.proyecto_comida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.EditText;

import com.example.proyecto_comida.Objetos.Administrador;

public class Menu_act extends AppCompatActivity {

    private EditText username,password;
    private Administrador adm = new Administrador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        username = findViewById(R.id.usernameText);
        password = findViewById(R.id.passwordText);
    }


    //Verificar login



    public void irCalcularDelivery(View view){
        Intent i = new Intent(this, calculos_act.class);
        startActivity(i);
    }

    public void login(View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }



}