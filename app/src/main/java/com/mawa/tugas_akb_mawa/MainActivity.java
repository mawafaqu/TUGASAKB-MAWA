package com.mawa.tugas_akb_mawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Tanggal Pengerjaan : 07 April 2020
//Deskripsi Pengerjaan : mengerjakan Endclass & Build APK
//NIM : 10117126
//Nama : Mawa Faqu R
//Kelas : IF4

public class MainActivity extends AppCompatActivity {

    Button btnMulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnMulai = (Button) findViewById(R.id.tmblMulai);

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Home1.class);
                startActivity(i);
            }

        });
    };
}