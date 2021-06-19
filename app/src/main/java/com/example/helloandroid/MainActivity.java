package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView browser = (WebView) findViewById(R.id.webView);
        browser.loadUrl("https://www.naver.com");
    }

    public void sendMessage(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("Hi!");
    }
}