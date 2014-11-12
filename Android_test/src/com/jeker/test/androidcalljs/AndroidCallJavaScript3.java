package com.jeker.test.androidcalljs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

import com.jeker.test.R;

public class AndroidCallJavaScript3 extends Activity {
	private EditText editTxt;
	private WebView webView;
	private Handler h = new Handler();

	private String str_tag="";
	
	String JsFunction="";
	@SuppressLint("JavascriptInterface")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		editTxt = (EditText) findViewById(R.id.txt);
		webView = (WebView) findViewById(R.id.wv);

		
		 JsFunction=Comment.getFromAssets(AndroidCallJavaScript3.this,"jsfunction.txt");
		
		 System.out.println("------JsFunction------->"+JsFunction);
		
		editTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            }

            @Override
            public void afterTextChanged(Editable arg0) {

                String  channal="101";
                
                String text = editTxt.getText().toString();
                if(!text.equals("")){
                double text2=Double.parseDouble(text);
//                Double.parseDouble(text)
             // 调用javascript的函数get4Android(str)
//				webView.loadUrl("javascript:get4Android('"+ text + "')");
                str_tag=text;
                
                try {
                    webView.loadUrl("javascript:try{AndroidCallJs("+ channal + ","+ text2 + ");}catch(e){}");
                } catch (Exception e) {
                    
                }
				
                }
//				view.loadUrl("javascript:try{autoplay();}catch(e){}"); // 调用 js 播放视频的方法
				
				
            }

        });
		
		
		
		WebSettings webSettings = webView.getSettings();

		webSettings.setJavaScriptEnabled(true);
		webSettings.setSaveFormData(false);
		webSettings.setSavePassword(false);
		webSettings.setSupportZoom(false);

		webView.addJavascriptInterface(new runJavaScript(), "myjs");
		// myjs是自己定义的，供javascript访问的接口

//		String url = "file:///android_asset/android2.html ";
//		webView.loadUrl(url);
		
		String url=Comment.HTML_HEAD1+Comment.HTML_HEAD2+Comment.HTML_HEAD3+Comment.HTML_HEAD4+Comment.HTML_BODY+JsFunction+Comment.HTML_HEAD5;
		
		System.out.println("-----url---->"+url);
		
		webView.loadData(url, "text/html", "UTF-8");
//		webView.loadData(Comment.HTML_HEAD1+Comment.HTML_HEAD2+Comment.HTML_HEAD3+Comment.HTML_HEAD4+Comment.HTML_BODY+Comment.HTML_HEAD5, "text/html", "UTF-8");
	}

	// The Java object that is bound runs in another thread and not in the
	// thread that it was constructed in.文档的一句话！
	final class runJavaScript {// 这个Java 对象是绑定在另一个线程里的，
		public void runOnAndroidJavaScript(final double str) {
			h.post(new Runnable() {
				@Override
				public void run() {// 这里应该特别注意的
					TextView show = (TextView) findViewById(R.id.show);
					show.setText("充值"+str_tag+"=" + str+"A币");
				}
			});
		}
	}
}
