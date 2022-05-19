package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kitaplar extends AppCompatActivity {

    Button necipFazil;
    Button pusluKitalar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitaplar);

        necipFazil= findViewById(R.id.ktp_necip);
        pusluKitalar= findViewById(R.id.ktp_puslu);

        necipFazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent necipFazilaGit = new Intent(kitaplar.this, NecipFazil.class);
                startActivity(necipFazilaGit);
            }
        });

        pusluKitalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pusluKitalaraGit = new Intent(kitaplar.this, PusluKitalar.class);
                startActivity(pusluKitalaraGit);
            }
        });
    }
}