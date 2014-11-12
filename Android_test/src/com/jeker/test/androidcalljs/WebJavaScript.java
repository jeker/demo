package com.jeker.test.androidcalljs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jeker.test.R;

public class WebJavaScript extends Activity {
	private EditText txt;
	private WebView wv;
	private Button btn;
	private Handler h = new Handler();

	@SuppressLint("JavascriptInterface")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		txt = (EditText) findViewById(R.id.txt);
		wv = (WebView) findViewById(R.id.wv);
		btn = (Button) findViewById(R.id.btn);

		WebSettings webSettings = wv.getSettings();

		webSettings.setJavaScriptEnabled(true);
		webSettings.setSaveFormData(false);
		webSettings.setSavePassword(false);
		webSettings.setSupportZoom(false);

		wv.addJavascriptInterface(new runJavaScript(), "myjs");
		// myjs是自己定义的，供javascript访问的接口

		String url = "file:///android_asset/android.html ";
		wv.loadUrl(url);

		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// 调用javascript的函数get4Android(str)
			    
				wv.loadUrl("javascript:get4Android('"+ txt.getText().toString() + "')");
				
				
				
			}
		});
	}

	// The Java object that is bound runs in another thread and not in the
	// thread that it was constructed in.文档的一句话！
	final class runJavaScript {// 这个Java 对象是绑定在另一个线程里的，
		public void runOnAndroidJavaScript(final String str) {
			h.post(new Runnable() {
				@Override
				public void run() {// 这里应该特别注意的
					TextView show = (TextView) findViewById(R.id.show);
					show.setText("This is a message from javascript:" + str);
				}

			});
		}
	}
}
