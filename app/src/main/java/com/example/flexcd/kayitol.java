package com.example.flexcd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class kayitol extends AppCompatActivity {
    EditText mail, sifre;
    Button kaydet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayitol);
        mail = findViewById(R.id.mail);
        sifre = findViewById(R.id.sifre);
        kaydet = findViewById(R.id.kaydet);
        FirebaseAuth auth = FirebaseAuth.getInstance();
        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.createUserWithEmailAndPassword(mail.getText().toString(),sifre.getText().toString())
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(getApplicationContext(), "başaarılı kayıt",Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(),oyunliste.class);
                                startActivity(intent);
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
                            }
                        });
            }
        });
    }
}