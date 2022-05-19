package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kategoriler extends AppCompatActivity {

    Button islamKitaplari;
    Button tarihkitaplari;
    Button edebiyatkitaplari;
    Button klasikitaplar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoriler);

        islamKitaplari=findViewById(R.id.islam);
        tarihkitaplari = findViewById(R.id.ktp_tarih);
        edebiyatkitaplari = findViewById(R.id.edebiyat);
        klasikitaplar = findViewById(R.id.dunya);


        islamKitaplari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent islamKitaplarinaGit = new Intent(kategoriler.this, islamKitaplari.class);
                startActivity(islamKitaplarinaGit);
            }
        });


        tarihkitaplari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tariheGit = new Intent(kategoriler.this, Tarih_kitap.class);
                startActivity(tariheGit);

            }
        });

        edebiyatkitaplari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent edebiayatGit = new Intent(kategoriler.this, Edebiyat.class);
                startActivity(edebiayatGit);

            }
        });

        klasikitaplar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent klasiketGit = new Intent(kategoriler.this, DunyaKlasikleri.class);
                startActivity(klasiketGit);

            }
        });





    }
}