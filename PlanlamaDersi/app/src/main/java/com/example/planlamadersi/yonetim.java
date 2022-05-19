package com.example.planlamadersi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class yonetim extends AppCompatActivity {

    ImageButton cikis;

    Button hakkimizda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetim);

        hakkimizda= findViewById(R.id.btn_hakkimizda);





        hakkimizda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hakkimzdayaGit= new Intent(yonetim.this,hakkimizda.class);
                startActivity(hakkimzdayaGit);

            }
        });
    }
}