package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Edebiyat extends AppCompatActivity {

    Button saat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edebiyat);

        saat= findViewById(R.id.saat);

        saat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saateGit = new Intent(Edebiyat.this,Saatlari_Ayarlama.class);
                startActivity(saateGit);
            }
        });
    }
}