package com.example.edu.startservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonPlayer).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, BindServiceActivity.class);
        startActivityForResult(intent, 105);
    }
}

/*

- startService
    bind Service

    unbind Service
  stopself  service 종료

- start service 시작하고 끝나고
  bind는 연결이 좀 복잡

- Notification
붙여줌
알려주는 내용 구성
Intent로 열고자 하는 액티비티로 지정

 */