package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class islamKitaplari extends AppCompatActivity {

    Button gazali;
    Button Siyer;
    ImageButton sepetGazali;
    ImageButton sepetEmin;
    ImageButton anasayfa;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String ad;
        String fiyat;
        ad= "kimya i saadet";
        fiyat= "30 tl";

        setContentView(R.layout.activity_islam_kitaplari);

        gazali = findViewById(R.id.btn_gazali);
        Siyer = findViewById(R.id.siyer);


        ImageButton anasayfa = (ImageButton) findViewById(R.id.ana_islam);





        gazali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gazaliYeGit = new Intent(islamKitaplari.this, imamGazali.class);
                startActivity(gazaliYeGit);
            }
        });

        Siyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siyereGit = new Intent(islamKitaplari.this, HerkesIcinSiyer.class);
                startActivity(siyereGit);
            }
        });


       /* sepetGazali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sepetegit= new Intent(islamKitaplari.this, Sepet.class);
                sepetegit.putExtra("ad",ad);
                sepetegit.putExtra("fiyat",fiyat) ;

                startActivity(sepetegit);

            }
        });


        */


      /* sepetGazali.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent sepetegit= new Intent(islamKitaplari.this, Sepet.class);
               //sepetegit.putExtra("ad",ad);
               //sepetegit.putExtra("fiyat",fiyat) ;

               startActivity(sepetegit);


           }
       });

      /* anasayfa.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent sepetimeGit = new Intent(islamKitaplari.this,AnaSayfa.class);
               startActivity(sepetimeGit);
           }
       });


       */






    }


}