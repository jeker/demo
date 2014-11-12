package com.jeker.test;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.jeker.test.MyAutoCompleteTextView.MyItemOnclik;

public class LoginActivity extends Activity  {
    public static final String TAG = "src.com.gionee.account.activity.LoginActivity";
    protected MyAutoCompleteTextView mUsernameActv;
    private EditText mPasswordEt;
    private EditText mPicAuthCodeInputEt;
    private RelativeLayout mPicAuthCodeLayout;
    private String mVid;
    private String mVty;
    private Dialog mDialog;
    protected ProgressBar mPicAuthCodePb;
    private ImageView mPicAuthCodeIv;
    private boolean mUpdateClicked = false;
    private boolean mLoginSucess = false;
    private int mOneKeyRegisterRequestCode = 10000;

    private final int PUT_DATA_YOUJU = 0x20;
    private int mMode;
    private AutoCompleteAdapter adapter;

    ArrayList<String> data = null;
    RelativeLayout mianLayout = null;
    
    
    private static final String[] cities = new String[] {"FuZhou", "XiaMen", "NiDe", "PuTian", "QuanZhou",
        "ZhangZhou", "LongYan", "SanMing", "NanPing"};
  
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_layout_login_activity);
        
        
        initView();
        
        
        data = new ArrayList<String>();
        data.add("10086");
        data.add("12345上山打老虎");
        data.add("1+1=2");
        data.add("10000");
        data.add("1234567");
        data.add("123哥想跳槽( ⊙ o ⊙ )嘛蛋");
        
        mUsernameActv.setFatherRelativeLayouyt(mianLayout);
        mUsernameActv.setMemoryData(data);

        
        mUsernameActv.addMyItemOnclik(new MyItemOnclik() {
            
            @Override
            public void ItemOnclik(String s) {
                // TODO Auto-generated method stub
                System.out.println("-hj----s--->"+s);
            }
        });
        
        
//        mUsernameActv.addMyTextWatcher(new MyTextWatcher() {
//            
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                // TODO Auto-generated method stub
//                System.out.println("-0----s--->"+s);
//            }
//            
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                // TODO Auto-generated method stub
//                System.out.println("-1----s--->"+s);
//            }
//            
//            @Override
//            public void afterTextChanged(Editable s) {
//                // TODO Auto-generated method stub
//                System.out.println("-2----s--->"+s);
//            }
//        });
//        
        
        
        
        
        
        mUsernameActv.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                mUsernameActv.showpopView();
                return false;
            }
        });
    }

    protected void initView() {
        mUsernameActv = (MyAutoCompleteTextView) findViewById(R.id.username_ll).findViewById(R.id.editText1);
        mPasswordEt = (EditText) findViewById(R.id.password_ll).findViewById(R.id.password_edittext);
        mianLayout = (RelativeLayout)findViewById(R.id.mainLayout);
        
        
//        mUsernameActv.setMyOnItemClickListener(new OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
//    
//                String dataString=data.get(position);
//                System.out.println("---dataString------->"+dataString);
//                
//
//            }
//        });
        
    }
    



}
