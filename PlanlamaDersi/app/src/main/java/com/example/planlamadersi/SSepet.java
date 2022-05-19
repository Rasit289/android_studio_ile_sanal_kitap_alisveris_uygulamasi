package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SSepet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_sepet);




        Intent i = getIntent();
        String s =i.getStringExtra("mesaj");
        TextView tv = (TextView) findViewById(R.id.txt_sepet_sepet);
        tv.setText(s);

        Intent i2 = getIntent();
        String s2 =i2.getStringExtra("mesaj2");
        TextView tv2 = (TextView) findViewById(R.id.txt_sepet_sepet2);
        tv2.setText(s2);

        ImageButton anasayfa = (ImageButton) findViewById(R.id.ana_sepet);

        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent AnaSayfayaGit = new Intent(SSepet.this, AnaSayfa.class);
                startActivity(AnaSayfayaGit);

            }
        });
    }
}