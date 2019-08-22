package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.StringReader;

public class OrderFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        final EditText Nama = (EditText) findViewById(R.id.edit_textdata1);
        final EditText Alamat = (EditText) findViewById(R.id.edit_textdata2);
        final EditText Pesan = (EditText) findViewById(R.id.edit_textdata3);

        Button button = (Button) findViewById(R.id.submitorder);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = Nama.getText().toString();
                String alamat = Alamat.getText().toString();
                String pesan = Pesan.getText().toString();



                Intent i = new Intent(OrderFood.this, hasilOrder.class);
                i.putExtra("Nama", nama);
                i.putExtra("Alamat", alamat);
                i.putExtra("Pesan", pesan);
                startActivity(i);
            }
        });
    }
}
