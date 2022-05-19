package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class kayi extends AppCompatActivity {

    TextView txt_kayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayi);

        final TextView et2 = (TextView) findViewById(R.id.txt_sepet_kayi);

        ((ImageButton)findViewById(R.id.image_button_kayi)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(kayi.this,SSepet.class);
                i.putExtra("mesaj2",et2.getText().toString());
                startActivity(i);
            }
        });

    }
}