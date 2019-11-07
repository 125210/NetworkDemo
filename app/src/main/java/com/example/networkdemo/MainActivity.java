package com.example.networkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnhuc,btnok,btngetother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnhuc = findViewById(R.id.btn_huc);
        btnok = findViewById(R.id.btn_oh);
        btngetother=findViewById(R.id.btn_getother);
        btnhuc.setOnClickListener(this);
        btngetother.setOnClickListener(this);
        btnok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_huc:
                Intent intent = new Intent(MainActivity.this,M2p1Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_oh:
                intent = new Intent(MainActivity.this, M2p2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_getother:
                intent = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
                break;
        }

    }
}
