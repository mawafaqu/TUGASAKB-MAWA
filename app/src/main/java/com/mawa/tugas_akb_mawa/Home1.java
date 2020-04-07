package com.mawa.tugas_akb_mawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home1 extends AppCompatActivity {
    private EditText kodekel;
    private Button masuk;
    public static final String KodeKeluarga = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);
        kodekel = findViewById(R.id.kodekel);
        masuk = findViewById(R.id.masuk);
        kodekel.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

            masuk.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String KodeKel = kodekel.getText().toString();

                    if (KodeKel.isEmpty()){
                       kodekel.setError("Masukan Kode Keluarga Disini");
                        return;
                    }

                    akses(KodeKel);
                }
            });
    }
    private void akses(String KodeKel){
        //create the intent
        Intent intent = new Intent(getApplicationContext(), Class2.class);
        intent.putExtra(KodeKel, KodeKel);
        startActivity(intent);
    }
}
