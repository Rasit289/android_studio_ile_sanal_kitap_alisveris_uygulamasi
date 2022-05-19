package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tarih_kitap extends AppCompatActivity {

    Button kayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarih_kitap);

        kayi= findViewById(R.id.btn_kayi);


        kayi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KayıyaGit = new Intent(Tarih_kitap.this, kayi.class);
                startActivity(KayıyaGit);
            }
        });
    }
}