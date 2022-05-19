package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class imamGazali extends AppCompatActivity {

    TextView gagzali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imam_gazali);

        String ad = "kimya";

        gagzali = findViewById(R.id.txt_sepet_gazali);

        //final TextView et = (TextView) findViewById(R.id.txt_sepet_gazali);

        ((ImageButton)findViewById(R.id.image_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(imamGazali.this,SSepet.class);
                i.putExtra("mesaj",gagzali.getText().toString());
                startActivity(i);
            }
        });
    }
}