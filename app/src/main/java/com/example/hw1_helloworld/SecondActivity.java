package com.example.hw1_helloworld;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btn2 = (Button) findViewById(R.id.next);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);
    }
}
