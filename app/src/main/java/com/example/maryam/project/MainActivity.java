package com.example.maryam.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button register,view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register= (Button) findViewById(R.id.buttonregister);
        view= (Button) findViewById(R.id.buttonview);
    }
}
