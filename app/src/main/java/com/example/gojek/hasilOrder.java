package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class hasilOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_order);

        Intent i = getIntent();
        String nama = getIntent().getStringExtra("Nama");
        String alamat = getIntent().getStringExtra("Alamat");
        String pesan = getIntent().getStringExtra("Pesan");

        TextView t = findViewById(R.id.text_viewdata);

        t.setText("" + nama + "\n" + alamat + "\n" + pesan);
    }
}
