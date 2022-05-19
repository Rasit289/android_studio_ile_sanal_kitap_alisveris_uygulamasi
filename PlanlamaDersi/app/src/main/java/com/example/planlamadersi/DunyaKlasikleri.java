package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DunyaKlasikleri extends AppCompatActivity {

    Button  don_kisot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dunya_klasikleri);

        don_kisot = findViewById(R.id.don_kisot);

        don_kisot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kisotaGit = new Intent(DunyaKlasikleri.this,Don_kisot.class);
                startActivity(kisotaGit);
            }
        });
    }
}