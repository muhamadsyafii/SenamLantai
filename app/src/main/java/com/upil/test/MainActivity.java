package com.upil.test;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    Button btnExit;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnReg = (Button) findViewById(R.id.btnReg);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Utama.class);
                startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //untuk exit
                //finish();
                moveTaskToBack(true);
            }
        });
    }
    public void onBackPressed() {
        Toast.makeText(this,"Tombol Back Tidak Berfungsi", Toast.LENGTH_LONG).show();

    }

    public void btnreg(View view) {
        startActivity(new Intent(this,Daftar.class));
    }
}