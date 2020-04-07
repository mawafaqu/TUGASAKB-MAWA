package com.mawa.tugas_akb_mawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Class2 extends AppCompatActivity {
    EditText textnama;
    EditText Umur;
    Button Lanjut;
    private String NAMES= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2);

       textnama = (EditText) findViewById(R.id.etNama);
        Umur = (EditText) findViewById(R.id.etUmur);
       Lanjut = (Button) findViewById(R.id.tmblS);

        Lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = textnama.getText().toString();
                String umur = Umur.getText().toString();

                if (nama.isEmpty()) {
                    textnama.setError("Isi Nama Kamu Disini");
                    return;
                }
                if (umur.isEmpty()) {
                    Umur.setError("Masukan Umur Kamu Disini");
                    return;
                }
                next(nama);
            }


            private void next(String nama) {
                //create the intent
                Intent intent = new Intent(getApplicationContext(), EndClass.class);
                intent.putExtra(NAMES, nama);
                startActivity(intent);
            }

        });
    };
}
