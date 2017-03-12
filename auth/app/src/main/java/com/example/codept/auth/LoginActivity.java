package com.example.codept.auth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private static Button btn;
    private static EditText uname;
    private static EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginActivity();
    }

    public void LoginActivity() {
        uname = (EditText) findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.upass);

        btn = (Button) findViewById(R.id.submit);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (uname.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))

                        {
                            Toast.makeText(LoginActivity.this, "valid credential", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(LoginActivity.this, "invalid credential", Toast.LENGTH_SHORT).show();
                        }
                    }

                }
        );
    }

}

