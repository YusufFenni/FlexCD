package com.example.flexcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class urun_liste2 extends AppCompatActivity {
    androidx.constraintlayout.widget.
            ConstraintLayout ConstraintLayout;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun_liste2);
        ConstraintLayout = findViewById(R.id.pubgcerceve);
        Intent intent4 = new Intent(getApplicationContext(), urundetay10.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent4);
            }

        });
        ConstraintLayout = findViewById(R.id.pubgcerceve2);
        Intent intent5 = new Intent(getApplicationContext(), urundetay8.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent5);
            }

        });
        ConstraintLayout = findViewById(R.id.pubgcerceve3);
        Intent intent6 = new Intent(getApplicationContext(), urundetay9.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent6);
            }

        });
        button = findViewById(R.id.pubgbutton1);
        Intent intent7 = new Intent(getApplicationContext(), sepetim.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent7);
            }

        });
        button = findViewById(R.id.pubgbutton2);
        Intent intent8 = new Intent(getApplicationContext(), sepetim.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent8);
            }

        });
        button = findViewById(R.id.pubgbutton3);
        Intent intent9 = new Intent(getApplicationContext(), sepetim.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent9);
            }

        });
        imageView = findViewById(R.id.imageView3);
        Intent intent10 = new Intent(getApplicationContext(), oyunliste.class);
        ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent10);
            }

        });
    }

}