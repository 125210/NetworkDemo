package com.example.networkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class M2p2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btngo,btnpo,btnoupload,btnoload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2p2);
        btngo= findViewById(R.id.btn_go);
        btnpo=findViewById(R.id.btn_po);
        btnoupload=findViewById(R.id.btn_oupload);
        btnoload=findViewById(R.id.btn_oload);
        btngo.setOnClickListener(this);
        btnpo.setOnClickListener(this);
        btnoupload.setOnClickListener(this);
        btnoload.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
