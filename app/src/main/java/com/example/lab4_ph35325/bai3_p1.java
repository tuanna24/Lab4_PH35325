package com.example.lab4_ph35325;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bai3_p1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_p1);
        Button button = findViewById(R.id.btn_dk);
        EditText editText =findViewById(R.id.edt1);
        EditText editText1 = findViewById(R.id.edt2);
        String user = getIntent().getStringExtra(bai3_p2.Key_Username);
        String pass = getIntent().getStringExtra(bai3_p2.Key_Password);
        editText.setText(user);
        editText1.setText(pass);
        Button button1 = findViewById(R.id.btn_dn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), bai3_p2.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), bai3_p2.class);
                startActivity(intent);
            }
        });
    }
}