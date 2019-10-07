package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class MonCompte extends AppCompatActivity {
    private TextView Nom;
    private TextView Prenom;
    private EditText login1;
    private TextView Email;
    private TextView Annee;
    public TextView txt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_compte);
        Nom = (TextView) findViewById(R.id.nom);
        Prenom = (TextView) findViewById(R.id.prenom);
        login1 = (EditText) findViewById(R.id.log3);
        txt= (TextView) findViewById(R.id.txt6);
        Email = (TextView) findViewById(R.id.email);
        Annee = (TextView) findViewById(R.id.annee);




        }

}