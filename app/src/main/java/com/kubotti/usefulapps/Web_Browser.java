package com.kubotti.usefulapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

import android.webkit.*;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Web_Browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_web__browser);

        final WebView webview = (WebView)findViewById(R.id.webview);
        //webview.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
        webview.setWebViewClient(new WebViewClient());
        //String url = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        Intent intent = getIntent();
        String url = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient());
        webview.loadUrl(url);
        //final Button js_setting = findViewById(R.id.js_true_or_false);
        /*js_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(js_setting.getText()=="true"){
                    js_setting.setText("false");
                    webview.getSettings().setJavaScriptEnabled(false);
                }
                else{
                    js_setting.setText("true");
                    webview.getSettings().setJavaScriptEnabled(true);
                }


            }
        });*/
    }
}
