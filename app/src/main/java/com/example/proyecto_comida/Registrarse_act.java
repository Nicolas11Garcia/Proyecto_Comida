package com.example.proyecto_comida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registrarse_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }




    public void login(View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}