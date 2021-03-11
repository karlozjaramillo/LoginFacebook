package com.cj.loginfacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etLoginName;
    private EditText etLoginPassword;
    private Button btnLoginSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
    }

    private void setContentView() {
        etLoginName = findViewById(R.id.txtUsernameFacebook);
        etLoginPassword = findViewById(R.id.txtPasswordFacebook);
        btnLoginSend = findViewById(R.id.btnLoginFacebook);
        btnLoginSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLoginFacebook) {
            sendLogin();
        }
    }

    private void sendLogin() {
        String fullText = etLoginName.getText().toString();
        String pass = etLoginPassword.getText().toString();
        String name = fullText.toLowerCase();

        if (name.equals("eduardo") && pass.equals("1234")) {
            /*Toast.makeText(this, "Hola " + fullText, Toast.LENGTH_LONG).show();*/
            Toast.makeText(this, "Has ingresado correctamente " + fullText, Toast.LENGTH_LONG).show();
        }
    }
}