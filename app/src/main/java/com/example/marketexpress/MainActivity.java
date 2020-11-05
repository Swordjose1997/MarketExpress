package com.example.marketexpress;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btSubmit;
    Button btReegistar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername =findViewById(R.id.et_username);
        etPassword =findViewById(R.id.et_password);
        btSubmit = findViewById(R.id.bt_submit);
        btReegistar = findViewById(R.id.bt_registrar);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(getApplicationContext(),Inicio.class);
                    startActivity(intent);


            }
        });
        btReegistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Registro.class);
                startActivity(intent);
            }
        });


    }
}