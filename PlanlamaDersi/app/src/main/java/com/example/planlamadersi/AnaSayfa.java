package com.example.planlamadersi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnaSayfa extends AppCompatActivity {

    Button kategoriler;
    Button kitaplar;
    Button bilgiler;
    ImageButton person;
    ImageButton cikis;
    Button sepet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        kategoriler=findViewById(R.id.btn_kategoriler);
        kitaplar=findViewById(R.id.btn_kitaplar);
        bilgiler=findViewById(R.id.btn_bilgiler);
        ImageButton person = (ImageButton) findViewById(R.id.btn_person);
        ImageButton cikis = (ImageButton) findViewById(R.id.btn_cikis);
        ImageButton supriz = (ImageButton) findViewById(R.id.btn_ana_random);
        sepet = findViewById(R.id.spt_buton);


        kategoriler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kategorilereGit = new Intent(AnaSayfa.this, kategoriler.class);
                startActivity(kategorilereGit);
            }
        });

        kitaplar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kitaplaraGit = new Intent(AnaSayfa.this, com.example.planlamadersi.kitaplar.class);
                startActivity(kitaplaraGit);
            }
        });



        bilgiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bilgilereGit= new Intent(AnaSayfa.this, bilgilerim.class);
                startActivity(bilgilereGit);
            }
        });

        sepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sepeteGit= new Intent(AnaSayfa.this, SSepet.class);
                startActivity(sepeteGit);

            }
        });

        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent peronaGit = new Intent(AnaSayfa.this, yonetim.class);
                startActivity(peronaGit);
            }
        });

        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                cikisyap();
            }
        });

        supriz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randomaGit = new Intent(AnaSayfa.this, RandomKitap.class);
                startActivity(randomaGit);


            }
        });





    }








    public void cikisyap() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);}



    }
