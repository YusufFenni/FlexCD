package com.example.flexcd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class urun_liste extends AppCompatActivity {
    ConstraintLayout ConstraintLayout;
    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun_liste);
        ConstraintLayout = findViewById(R.id.pubgcerceve);
        Intent intent4 = new Intent(getApplicationContext(), urundetayy.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent4);
            }

        });
        ConstraintLayout = findViewById(R.id.constraintLayout2);
        Intent intent5 = new Intent(getApplicationContext(), urundetay2.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent5);
            }

        });
        ConstraintLayout = findViewById(R.id.viperrr);
        Intent intent6 = new Intent(getApplicationContext(), urundetay3.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent6);
            }

        });
        button = findViewById(R.id.valobutton1);
        Intent intent7 = new Intent(getApplicationContext(), sepetim.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent7);
            }

        });
        button = findViewById(R.id.valobutton2);
        Intent intent8 = new Intent(getApplicationContext(), sepetim.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent8);
            }

        });
        button = findViewById(R.id.valobutton3);
        Intent intent9 = new Intent(getApplicationContext(), sepetim.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent9);
            }

        });
        imageView = findViewById(R.id.geribtnvalorant);
        Intent intent10 = new Intent(getApplicationContext(), oyunliste.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent10);
            }

        });
    }
}