package com.example.networkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnweather,btnoil,btnnews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btnweather = findViewById(R.id.btn_weather);
        btnoil = findViewById(R.id.btn_oil);
        btnnews=findViewById(R.id.btn_news);
        btnnews.setOnClickListener(this);
        btnoil.setOnClickListener(this);
        btnweather.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
