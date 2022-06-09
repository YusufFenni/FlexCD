package com.example.flexcd;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class oyunliste extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyunliste);

        imageView = findViewById(R.id.valorantoyun);
        Intent intent = new Intent(getApplicationContext(),urun_liste.class);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }

        });
        imageView = findViewById(R.id.pubgoyun);
        Intent intent1 = new Intent(getApplicationContext(),urun_liste2.class);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }

        });
        imageView = findViewById(R.id.csgooyun);
        Intent intent2 = new Intent(getApplicationContext(),urun_liste3.class);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }

        });

    }
}