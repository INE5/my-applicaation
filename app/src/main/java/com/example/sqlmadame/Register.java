package com.example.sqlmadame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
Button Register, Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
Register=findViewById(R.id.btnRegister);
Login= findViewById(R.id.btnRegisterLogin);


Register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Register.this, Login.class );
        startActivity(intent);
    }
});

Login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Register.this, Login.class );
        startActivity(intent);
    }
});








    }
}