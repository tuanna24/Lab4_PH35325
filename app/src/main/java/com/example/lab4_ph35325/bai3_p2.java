package com.example.lab4_ph35325;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bai3_p2 extends AppCompatActivity {
    public static String Key_Username = "username";
    public static String Key_Password = "password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_p2);
        EditText editUser = findViewById(R.id.edt_User);
        EditText editPast = findViewById(R.id.edt_Pass);
        EditText editPast2 = findViewById(R.id.edt_rePass);
        Button button = findViewById(R.id.btn_dk1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tk = editUser.getText().toString();
                String mk = editPast.getText().toString();
                String rmk = editPast2.getText().toString();
                if(tk == null || tk.equals("")){
                    Toast.makeText(bai3_p2.this, "Chua nhap UserName", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(mk == null || mk.equals("")){
                    Toast.makeText(bai3_p2.this, "Chua nhap Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(rmk == null || rmk.equals("")){
                    Toast.makeText(bai3_p2.this, "Chua xac nhan Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!rmk.equals(mk)){
                    Toast.makeText(bai3_p2.this, "Khong khop password", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(),bai3_p1.class);
                intent.putExtra(Key_Username,tk);
                intent.putExtra(Key_Password,mk);
                startActivity(intent);
            }
        });
    }
}