package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText kullaniciAdi;
    Button giris;
    EditText sifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String ad;
        ad= "Rasit";





        giris = findViewById(R.id.btngiris);
        kullaniciAdi=findViewById(R.id.eposta);
        sifre=findViewById(R.id.sifre);



        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String kullaniciAd= kullaniciAdi.getText().toString();
                String sifre1 = sifre.getText().toString();

                //kontroller boşsa uyari ver
                if(TextUtils.isEmpty(kullaniciAd)||TextUtils.isEmpty(sifre1)){

                    Toast.makeText(MainActivity.this, "bütün alanları doldurun", Toast.LENGTH_LONG).show();
                }
                else if(kullaniciAd.equals("rasit")&&sifre1.equals("1234")){

                    Toast.makeText(MainActivity.this, "giriş yapılıyor", Toast.LENGTH_LONG).show();

                    Intent anaSayfayaGit = new Intent(MainActivity.this,AnaSayfa.class);

                    //Ana sayfaya isim gönderme
                    anaSayfayaGit.putExtra("ad",kullaniciAd) ;

                    startActivity(anaSayfayaGit);
                }

                else{
                    Toast.makeText(MainActivity.this, "kullanici adi veya sifre yanlis", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
    }
