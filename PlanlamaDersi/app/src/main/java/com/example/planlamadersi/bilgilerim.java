package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bilgilerim extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgilerim);

        ImageButton konum = (ImageButton) findViewById(R.id.konum);

        konum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent KonumaGit= new Intent(bilgilerim.this, konum.class);
                startActivity(KonumaGit);

            }
        });

    }
}