package com.baqiinfo.githubtest;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/** 
 * description: 修改首页
 * author: fenqgingyang
 * date: 2021/1/13 10:54 
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uridata = getIntent().getData();
        if (uridata!=null) {
            String id=uridata.getQueryParameter("param");
            Toast.makeText(this, "唤起参数:"+id, Toast.LENGTH_SHORT).show();
        }

    }
}
