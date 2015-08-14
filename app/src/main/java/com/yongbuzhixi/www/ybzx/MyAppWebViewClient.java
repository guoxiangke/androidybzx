package com.yongbuzhixi.www.ybzx;

import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.net.Uri;
import android.content.Intent;

/**
 * Created by dale.guo on 8/14/15.
 */
public class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("yongbuzhixi.com")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}