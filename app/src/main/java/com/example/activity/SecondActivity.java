package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView t;
    private Button btn;
    private Button compt;
    private Button papier;
    private TextView test;
    private TextView testmdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = findViewById(R.id.button6);
        papier = findViewById(R.id.btn8);
        compt = findViewById(R.id.moncompt);
        t = (TextView) findViewById(R.id.affiche);
        test = (TextView) findViewById(R.id.t2);
        testmdp = (TextView) findViewById(R.id.t3);

        //visibility of TextView
        test.setVisibility(View.GONE);
        testmdp.setVisibility(View.GONE);

        //save the data of login and password into the TextView
        Intent t = getIntent();
        String str = t.getStringExtra("message_key");
        String password = t.getStringExtra("message_key_Password");
        test.setText(str);
        testmdp.setText(password);

        compt.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v) {

                String str1 = test.getText().toString();
                String password1 = testmdp.getText().toString();
                Intent k = new Intent(SecondActivity.this, MonCompte.class);

                k.putExtra("message_key", str1);
                k.putExtra("message_key_Password", password1);
                startActivity(k);

            }

        });

        papier.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v) {
                Intent k = new Intent(SecondActivity.this, List1.class);

                startActivity(k);

            }

        });
    }

}