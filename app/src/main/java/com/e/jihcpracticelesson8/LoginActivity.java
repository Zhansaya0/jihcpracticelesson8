package com.e.jihcpracticelesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_tirkelu,btn_kiru;
    EditText et_email, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_tirkelu = findViewById(R.id.btn_tirkelu);
        btn_kiru = findViewById(R.id.btn_kiru);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);


        btn_tirkelu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrationIntent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(registrationIntent);
            }
        });
        btn_kiru.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(TextUtils.isEmpty(et_email.getText())){
                            et_email.setError("Мәліметтерді толық енгізіңіз");
                            return;
                        }if(TextUtils.isEmpty(et_password.getText())){
                            et_password.setError("Мәліметтерді толық енгізіңіз");
                            return;
                        }

                        if(et_email.getText().toString().equals("user@gmail.com")&&
                           et_password.getText().toString().equals("123123")){
                            Intent registrationIntent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(registrationIntent);
                        }else{
                            Toast.makeText(LoginActivity.this, "почта н/е пароль қате енгізілді", Toast.LENGTH_SHORT);
                        }

                    }
                });

    }
}