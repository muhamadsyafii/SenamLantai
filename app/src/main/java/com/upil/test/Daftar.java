package com.upil.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Daftar extends AppCompatActivity {

    EditText usr, pwd;
    Button daftar;
    Button exit;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        usr = (EditText) findViewById(R.id.txtusr);
        pwd = (EditText) findViewById(R.id.txtpwd);
        daftar = (Button) findViewById(R.id.btnDaftar);
        exit = (Button) findViewById(R.id.btnext);
        spinner = (Spinner) findViewById(R.id.spinner);

        String [] jenkel={"Laki-laki","Perempuan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,jenkel);
        spinner.setAdapter(adapter);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar = new Intent(Daftar.this, MainActivity.class);
                startActivity(daftar);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Daftar.this, MainActivity.class));
                finish();
            }
        });
    }
        public void onBackPressed() {
            Toast.makeText(this,"Tombol Back Tidak Berfungsi", Toast.LENGTH_LONG).show();
    }

}
