package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.security.auth.login.LoginException;

public class SecondActivity extends AppCompatActivity {

    private TextView t;
    private Button btn;
    private Button compt;
    private Button papier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = findViewById(R.id.button6);
        papier = findViewById(R.id.btn8);
        compt = findViewById(R.id.moncompt);
        t = (TextView) findViewById(R.id.affiche);





    compt.setOnClickListener(new View.OnClickListener()

    {


        @Override
        public void onClick ( View v){
        Intent k = new Intent(SecondActivity.this, MonCompte.class);
        //k.putExtra("ll", "login");
            //Bundle b = getIntent( ).getExtras( );
            //String s = b.getString(utilisateur.getLogin().toString());
            //p.setText("ff"+ s);
        startActivity(k);

    }

    });

        papier.setOnClickListener(new View.OnClickListener()

        {


            @Override
            public void onClick ( View v){
                Intent k = new Intent(SecondActivity.this, List1.class);
                //k.putExtra("ll", "login");
                //Bundle b = getIntent( ).getExtras( );
                //String s = b.getString(utilisateur.getLogin().toString());
                //p.setText("ff"+ s);
                startActivity(k);

            }

        });
}

}
