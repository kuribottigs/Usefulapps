package com.kubotti.usefulapps;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

import android.webkit.*;

import android.widget.*;

import android.os.Bundle;

public class infomation_dialog extends Dialog {
    public infomation_dialog(Context context){
        super(context);
    }
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setTitle("Infomation");
        setContentView(R.layout.info_dia);
        WebView webView = findViewById(R.id.webview_dia);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("file:///android_asset/html/infomation.pdf");
    }
}
