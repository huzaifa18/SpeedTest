package com.speedtest

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.webkit.WebView

class WebViewClass : AppCompatActivity() {

    lateinit var myWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_web_view)

        val myWebView = WebView(this@WebViewClass)
        setContentView(myWebView)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.loadsImagesAutomatically = true
        myWebView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        myWebView.loadUrl("http://speed.googlefiber.net/")

        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        val attrib = window.attributes
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            attrib.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
        }

        //init()
    }

    fun init(){
        myWebView = findViewById(R.id.webview)
        setContentView(myWebView)
        myWebView.loadUrl("http://speed.googlefiber.net/")
    }

}