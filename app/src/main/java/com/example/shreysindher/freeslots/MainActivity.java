package com.example.shreysindher.freeslots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView) findViewById(R.id.webviewer);
        webView.setWebViewClient(new WebViewClient());
        // string url which you have to load into a web view
        String url = "https://freeslot.acmvit.in/#/";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url); // load the url on the web view
    }
}
