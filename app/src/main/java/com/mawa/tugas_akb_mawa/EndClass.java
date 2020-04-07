package com.mawa.tugas_akb_mawa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EndClass extends AppCompatActivity {
    TextView namasatu;
    TextView namadua;
    TextView namatiga;

    private String textnama;
    private String NAMES = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_class);
       namasatu = (TextView) findViewById(R.id.namasatu);
        namadua = (TextView) findViewById(R.id.namadua);
        namatiga = (TextView) findViewById(R.id.nama3);
        Bundle extras = getIntent().getExtras();
        textnama = extras.getString(NAMES);
        namasatu.setText("" + textnama + " ");
        namadua.setText("" + textnama + " ");
        namatiga.setText("" + textnama + " ");
    }
}