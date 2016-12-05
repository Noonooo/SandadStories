package com.nirmeen.sandadstories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView webView=(WebView)findViewById(R.id.webView);
        Intent data=getIntent();
        int page=data.getExtras().getInt("page");
        page++;
        webView.loadUrl("file:///android_asset/html/"+page+".html");
    }

  }
