package com.example.sqlmadame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
Button Register, Login;
EditText Email, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
Register= findViewById(R.id.btnLoginRegister);
Login = findViewById(R.id.btnLogin);
Email= findViewById(R.id.LoginEmail);
Password= findViewById(R.id.LoginPassword);


Register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(com.example.sqlmadame.Login.this, Register.class );
        startActivity(intent);
    }
});




Login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
String EmailChamp = Email.getText().toString();
String PasswordChamp = Password.getText().toString();

if ( (EmailChamp=="admin@gmail.com")  && (PasswordChamp=="admin") )
{
    Intent intent = new Intent(com.example.sqlmadame.Login.this, AdminFeedback.class );
    startActivity(intent);
}
        if ( (EmailChamp=="")  && (PasswordChamp=="") )
        {
            Toast.makeText(Login.this, "You should enter your email and password", Toast.LENGTH_SHORT).show();
        }


else {
    Intent intent1 = new Intent(com.example.sqlmadame.Login.this, UserFeedback.class );
    startActivity(intent1);
}

    }


















});

















    }
}