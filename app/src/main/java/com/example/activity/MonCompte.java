package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

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
    private EditText mdp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_compte);
        Nom = (TextView) findViewById(R.id.nom);
        Prenom = (TextView) findViewById(R.id.prenom);
        login1 = (EditText) findViewById(R.id.log3);
        txt = (TextView) findViewById(R.id.txt6);
        Email = (TextView) findViewById(R.id.email);
        Annee = (TextView) findViewById(R.id.annee);
        mdp1 = (EditText) findViewById(R.id.passwrd);

        //show the login and the password into MonCompte
        Intent t = getIntent();
        String str = t.getStringExtra("message_key");
        String psw = t.getStringExtra("message_key_Password");
        login1.setText(str);
        mdp1.setText(psw);
    }

}