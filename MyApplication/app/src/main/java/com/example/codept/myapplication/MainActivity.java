package com.example.codept.myapplication;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void add(View v) {
        EditText num1 = (EditText) findViewById(R.id.t1);
        EditText num2 = (EditText) findViewById(R.id.t2);
        TextView result = (TextView) findViewById(R.id.r1);


        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());

        int c = a + b;

        result.setText(Integer.toString(c));


    }

    public void sub(View v) {
        EditText num1 = (EditText) findViewById(R.id.t1);
        EditText num2 = (EditText) findViewById(R.id.t2);
        TextView result = (TextView) findViewById(R.id.r1);


        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());

        int c = a - b;

        result.setText(Integer.toString(c));

    }

    public void mult(View v) {
        EditText num1 = (EditText) findViewById(R.id.t1);
        EditText num2 = (EditText) findViewById(R.id.t2);
        TextView result = (TextView) findViewById(R.id.r1);


        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());

        int c = a * b;

        result.setText(Integer.toString(c));


    }

    public void div(View v) {
        EditText num1 = (EditText) findViewById(R.id.t1);
        EditText num2 = (EditText) findViewById(R.id.t2);
        TextView result = (TextView) findViewById(R.id.r1);


        float a = Float.parseFloat(num1.getText().toString());
        float b = Float.parseFloat(num2.getText().toString());

        float c = a / b;

        result.setText(Float.toString(c));

    }
}

