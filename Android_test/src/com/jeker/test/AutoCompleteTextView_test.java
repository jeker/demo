package com.jeker.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ArrayAdapter;
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

public class AutoCompleteTextView_test extends Activity {
    // 福建九地市
    private static final String[] cities = new String[] {"FuZhou", "XiaMen", "NiDe", "PuTian", "QuanZhou",
            "ZhangZhou", "LongYan", "SanMing", "NanPing"};
    private AutoCompleteTextView autoCompleteTextView = null;
    private MultiAutoCompleteTextView multiAutoCompleteTextView = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autotextview);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);

        // 创建适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.simple_dropdown_item_1line2, cities);
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








//  AutoCompleteTextView 在没有输入任何东西也给予提示  还有这个方法
//http://dengyin2000.iteye.com/blog/1740827


 
// package com.wole.android.pad.view;
//
//import android.content.Context;
//import android.graphics.Rect;
//import android.util.AttributeSet;
//import android.widget.AutoCompleteTextView;
//
///**
// * Created with IntelliJ IDEA.
// * User: denny
// * Date: 12-12-4
// * Time: 下午2:16
// * To change this template use File | Settings | File Templates.
// */
//public class InstantAutoComplete extends AutoCompleteTextView {
//    private int myThreshold;
//
//    public InstantAutoComplete(Context context) {
//        super(context);
//    }
//
//    public InstantAutoComplete(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public InstantAutoComplete(Context context, AttributeSet attrs, int defStyle) {
//        super(context, attrs, defStyle);
//    }
//
//    @Override
//    public boolean enoughToFilter() {
//        return true;
//    }
//
//    @Override
//    protected void onFocusChanged(boolean focused, int direction,
//                                  Rect previouslyFocusedRect) {
//        super.onFocusChanged(focused, direction, previouslyFocusedRect);
//        if (focused) {
//            performFiltering(getText(), 0);
//            showDropDown();
//        }
//    }
//
//    public void setThreshold(int threshold) {
//        if (threshold < 0) {
//            threshold = 0;
//        }
//        myThreshold = threshold;
//    }
//
//    public int getThreshold() {
//        return myThreshold;
//    }
//}
//

// 
//searchSuggestionAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, new ArrayList<String>(5));
//search_et.setAdapter(searchSuggestionAdapter);
//search_et.addTextChangedListener(new TextWatcher() {
//    @Override
//    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//    }
//
//    @Override
//    public void onTextChanged(CharSequence s, int start, int before, int count) {
//    }
//
////如果没有输入任何东西 则显示默认列表，否则调用接口，展示下拉列表
//    @Override
//    public void afterTextChanged(Editable s) {
//        if (s.length() >= 1) {
//            if (fetchSearchSuggestionKeywordsAsyncTask != null) {
//                fetchSearchSuggestionKeywordsAsyncTask.cancel(true);
//            }
//            fetchSearchSuggestionKeywordsAsyncTask =new FetchSearchSuggestionKeywordsAsyncTask();
//            fetchSearchSuggestionKeywordsAsyncTask.execute();
//        }else{
//            showHotSearchKeywords();
//        }
//
//    }
//});
//
//search_et.setOnItemClickListener(new OnItemClickListener() {
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        String item = searchSuggestionAdapter.getItem(position);
//        search_et.setText(item);
//        search_btn.performClick();
//    }
//});
//
// //点击autocompletetextview时，如果没有输入任何东西 则显示默认列表
//search_et.setOnTouchListener(new View.OnTouchListener() {
//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        if (TextUtils.isEmpty(search_et.getText().toString())) {
//            showHotSearchKeywords();
//        }
//        return false;
//    }
//
//});
 
//
//
////这里发现很奇怪的事情， 需要每次new一个ArrayAdapter，要不然有时调用showDropDown不会有效果
//private void showHotSearchKeywords() {
//      MiscUtil.prepareHotSearchKeywords(getWoleApplication());
//      searchSuggestionAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, getWoleApplication().hotSearchHistoryKeywords);
//      search_et.setAdapter(searchSuggestionAdapter);
//      searchSuggestionAdapter.notifyDataSetChanged();
//      search_et.showDropDown();
//  }
//
//  private class FetchSearchSuggestionKeywordsAsyncTask extends AsyncTask<Void, Void, List<String>> {
//
//      @Override
//      protected List<String> doInBackground(Void... params) {
//          List<String> rt = new ArrayList<String>(5);
//          String keyword = search_et.getText().toString();
//          if (!TextUtils.isEmpty(keyword)) {
//              try {
//                  String result = NetworkUtil.doGet(BaseActivity.this, String.format(Global.API_SEARCH_SUGGESTIOIN_KEYWORDS, URLEncoder.encode(keyword, "utf-8")), false);
//                  Log.i("FetchSearchSuggestionKeywordsAsyncTask", result);
//                  if (!TextUtils.isEmpty(result)) {
//                      JSONArray array = new JSONArray(result);
//                      for (int i = 0; i < array.length(); i++) {
//                          JSONObject jsonObject = array.getJSONObject(i);
//                          rt.add(jsonObject.optString("keyword"));
//                      }
//                  }
//              } catch (Exception e) {
//                  e.printStackTrace();
//              }
//          }
//          return rt;
//      }
//
//      @Override
//      protected void onPostExecute(List<String> strings) {
//          super.onPostExecute(strings);
//          if (!strings.isEmpty()) {
////这里发现很奇怪的事情， 需要每次new一个ArrayAdapter，要不然有时调用showDropDown不会有效果
//              searchSuggestionAdapter = new ArrayAdapter<String>(BaseActivity.this, android.R.layout.simple_dropdown_item_1line, strings);
//              search_et.setAdapter(searchSuggestionAdapter);
//              searchSuggestionAdapter.notifyDataSetChanged();
//          }
//      }
//  }










