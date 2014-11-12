package com.jeker.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener  {

	
	private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
	private Context context;
    private TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		context=this;
		iniView();
		
		
		 text=(TextView) findViewById(R.id.text);
//		 String newMessageInfo = "<font color='red'><b>" + 红色内容+ "</b></font>TextView学习显示不同颜色";
//		 text.setTextView(Html.fromHtml(newMessageInfo));
		 setTextViewValueAndColor(text, R.string.pay_result_statu, getString(R.string.pay_result_statu_recharge_success_not_pay));
		
	}
	
	private void iniView(){
		btn1=(Button) findViewById(R.id.btn1);
		btn2=(Button) findViewById(R.id.btn2);
		btn3=(Button) findViewById(R.id.btn3);
		btn4=(Button) findViewById(R.id.btn4);
		btn5=(Button) findViewById(R.id.btn5);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
	}
	
	
	@Override
	public void onClick(View v) {

		Intent intent=new Intent();
		
		switch (v.getId()) {
		case R.id.btn1:
		    intent.setClass(context, AutoCompleteTextView_test.class);
			startActivity(intent);
			break;
	   case R.id.btn2:
	       
	       try {
	       Context     mContext = getApplicationContext().createPackageContext("com.jeker.test1",Context.CONTEXT_IGNORE_SECURITY);
           SharedPreferences sp = mContext.getSharedPreferences("accoutShare",MODE_WORLD_READABLE);
           String accountInfos = sp.getString("accountInfos", "");
           System.out.println("----accountInfos---1--->"+accountInfos);
	       
           
           
//           Context     mContext2 = context.createPackageContext("com.jeker.test2",Context.CONTEXT_IGNORE_SECURITY);
//           SharedPreferences sp2 = mContext2.getSharedPreferences("accoutShare",getApplicationContext().MODE_WORLD_READABLE);
//           String accountInfos2 = sp2.getString("accountInfos", "");
//           System.out.println("----accountInfos----2-->"+accountInfos2);
           
	       
	       }  catch (NameNotFoundException e) {
               //e.printStackTrace();
               System.out.println("--没有找到包名-----");
               
           } catch (Exception e) {
               System.out.println("--没有找到包名-----"+e);
           }
           
           
			break;
	    case R.id.btn3:
	           
	           try {
	               
	               
//	           Context     mContext = context.createPackageContext("com.android.amigame",
//	                   Context.CONTEXT_IGNORE_SECURITY);
//	           SharedPreferences sp = mContext.getSharedPreferences("accoutShare",getApplicationContext().MODE_WORLD_READABLE);
//	           String accountInfos = sp.getString("accountInfos", "");
//	           System.out.println("----accountInfos------>"+accountInfos);
	           
	               Context     mContext2 = getApplicationContext().createPackageContext("com.jeker.test2",Context.CONTEXT_IGNORE_SECURITY);
	             SharedPreferences sp2 = mContext2.getSharedPreferences("accoutShare",MODE_WORLD_READABLE);
	             String accountInfos2 = sp2.getString("accountInfos", "");
	             System.out.println("----accountInfos----2-->"+accountInfos2);
	           
	           
	           
	           
	           }  catch (NameNotFoundException e) {
	               //e.printStackTrace();
	               System.out.println("--没有找到包名---2--");
	               
	           } catch (Exception e) {
	               System.out.println("--没有找到包名---2--"+e);
	           }
	            break;
	            
	    case R.id.btn4:
            intent.setClass(context, AutoCompleteTextView_test2.class);
            startActivity(intent);
            break;
	            
	    case R.id.btn5:
            intent.setClass(context, LoginActivity.class);
            startActivity(intent);
            break;
		default:
			break;
		}
	}

	
	
	  private void setTextViewValueAndColor(TextView textviw, int stringID, String needValue) {
		     String tip = String.format(getString(stringID), needValue);
		     Spanned source = Html.fromHtml(tip);
		     textviw.setText(source);
		    }

}
