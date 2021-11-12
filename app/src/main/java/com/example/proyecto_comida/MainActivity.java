package com.example.proyecto_comida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login(View view){

        Intent i = new Intent(this, Menu_act.class);
        startActivity(i);

    }



    public void registrarse(View view){

        Intent i = new Intent(this, Registrarse_act.class);
        startActivity(i);

    }



    //redes
    public void Facebook(View view){

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com"));
        startActivity(i);

    }

    public void Instagram(View view){

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.instagram.com"));
        startActivity(i);

    }

    public void Whatsap(View view){

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://web.whatsapp.com/"));
        startActivity(i);

    }
}