package com.example.networkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class M2p1Activity extends AppCompatActivity implements View.OnClickListener {
    private static final String IP_URL = "http://ip.taobao.com/service/getIpInfo.php?ip=112.2.253.153";
    Button btnhg,btnhp,btnhupload,btnhload;
    ScrollView scrollView;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2p1);
        scrollView=findViewById(R.id.scrh);
        textView = findViewById(R.id.tvh);
        imageView=findViewById(R.id.ivh);
        btnhg= findViewById(R.id.btn_hg);
        btnhp=findViewById(R.id.btn_hp);
        btnhupload=findViewById(R.id.btn_hupload);
        btnhload=findViewById(R.id.btn_hload);
        btnhg.setOnClickListener(this);
        btnhp.setOnClickListener(this);
        btnhupload.setOnClickListener(this);
        btnhload.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_hg:
                scrollView.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.GONE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final String result = NetworkUtils.get(IP_URL);
                        if(result != null){
                            Log.d("MainActivity",result);
                            textView.post(new Runnable() {
                                @Override
                                public void run() {
                                    textView.setText(result);
                                }
                            });
                        }else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    textView.setText("数据为null");
                                }
                            });
                        }
                    }
                }).start();

                break;
            case R.id.btn_hp:

                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        final String result = NetworkUtils.get(IP_URL);
                        if (result != null) {
                            Log.d("MainActivity", result);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    textView.setText(result);
                                }
                            });
                        } else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    textView.setText("请求失败");
                                }
                            });
                        }
                    }
                }).start();
                break;

        }

    }
}
