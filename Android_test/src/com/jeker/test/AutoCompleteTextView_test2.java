package com.jeker.test;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

/**
 * 
 * AutoCompleteTextView
 * 
 * @author jeker
 * 
 * 2014年8月29日
 *
 */

public class AutoCompleteTextView_test2 extends Activity {
    // 福建九地市
    private static final String[] cities = new String[] {"FuZhou", "XiaMen", "NiDe", "PuTian", "QuanZhou",
            "ZhangZhou", "LongYan", "SanMing", "NanPing"};
    private AutoCompleteTextView autoCompleteTextView = null;
    private MultiAutoCompleteTextView multiAutoCompleteTextView = null;

    private AutoCompleteAdapter adapter;
    private ArrayList<String> mOriginalValues=new ArrayList<String>();
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autotextview);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);

        
        mOriginalValues.add("1234561");
        mOriginalValues.add("1234562");
        mOriginalValues.add("2234563");
        mOriginalValues.add("2234564");
        mOriginalValues.add("3234561111");
        mOriginalValues.add("32345622222");
        mOriginalValues.add("323456333333");
        mOriginalValues.add("3234564444");
        mOriginalValues.add("3234565555");
        mOriginalValues.add("32345666666");
        mOriginalValues.add("32345777777");
        
        
        
        // 创建适配器
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_dropdown_item_1line, cities);
        
        adapter = new AutoCompleteAdapter(this, mOriginalValues, 10);
        
        autoCompleteTextView.setAdapter(adapter);
        // 设置输入多少字符后提示，默认值为2
        autoCompleteTextView.setThreshold(1);
        
      //  AutoCompleteTextView 在没有输入任何东西也给予提示  使用这个方法
        autoCompleteTextView.setOnTouchListener(new OnTouchListener(){ 
            @Override 
            public boolean onTouch(View v, MotionEvent event){ 
                autoCompleteTextView.showDropDown();//显示下拉列表 
                       return false; 
            } 
            });
        
        

        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setThreshold(2);
        // 用户必须提供一个MultiAutoCompleteTextView.Tokenizer用来区分不同的子串。
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}




