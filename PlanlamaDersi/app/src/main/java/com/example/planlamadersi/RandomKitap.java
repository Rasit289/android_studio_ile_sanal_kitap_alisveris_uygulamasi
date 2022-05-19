package com.example.planlamadersi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RandomKitap extends AppCompatActivity {

    Button btn_sec;
    TextView txt_random;
    int a;
    String kitap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_kitap);

        btn_sec= findViewById(R.id.btn_sec);
        txt_random = findViewById(R.id.txt_random);

        String kitaplar []= {"Kürk Mantolu Madonna","Küçük Prens","Satranç","Dönüşüm","Şeker Portakalı","Simyacı","Uçurtma Avcısı","Kuyucaklı Yusuf","İnsan Neyle Yaşar?" +
                "Çalıkuşu","Bin Muhteşem Güneş","Kardeşimin Hikayesi","Dokuzuncu Hariciye Koğuşu","Huzursuzluk","Genç Werther'in Acıları","Sefiller"};
        a= ((int)(Math.random()*16));

        btn_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a= ((int)(Math.random()*15));

                kitap = kitaplar[a];

                txt_random.setText(String.valueOf(kitap));



            }
        });


    }
}