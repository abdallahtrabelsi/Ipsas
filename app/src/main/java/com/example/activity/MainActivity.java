package com.example.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {
    private Button btn;
    private Button quite;
    private EditText mdp;
//utilisateur cl_utilisateur=new utilisateur();

    private TextView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        log = findViewById(R.id.log3);
        mdp =findViewById(R.id.mdp);
        quite =findViewById(R.id.close);


        //noinspection deprecation
        btn.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                if (log.getText().toString().isEmpty() || mdp.getText().toString().isEmpty()){

                    AlertDialog.Builder boite = new AlertDialog.Builder(MainActivity.this,R.style.alert);
                    boite.setTitle("Donner Un Login et Mot De Passe !");
                    // boite.setIcon(R.drawable.ghh);
                    boite.setMessage("");
                    boite.setPositiveButton("retry", new DialogInterface.OnClickListener( ) {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {}

                            }

                    );
                    boite.show();

            }
                else {
                    Intent t = new Intent(MainActivity.this, SecondActivity.class);
                   // t.putExtra("login","");
                    startActivity(t);



                }
            }






        });

        quite.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }


                });

    }

    }

