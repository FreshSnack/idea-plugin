package com.amar.service;

import javafx.scene.web.WebView;

/**
 * @Author: mxding
 * @Date: 2018-12-27 17:23
 */
public class BrowserService {
    private WebView webView;

    public BrowserService() {
        webView = new WebView();
    }

    public WebView getWebView() {
        return webView;
    }
}
