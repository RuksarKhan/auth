package com.example.codept.auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openLogin();
    }

public void openLogin()
{
   btn = (Button)findViewById(R.id.button);
   btn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
            Intent intent = new Intent("com.example.codept.auth.LoginActivity");
            startActivity(intent);
       }
   });

}

}


