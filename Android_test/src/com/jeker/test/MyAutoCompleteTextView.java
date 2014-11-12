package com.jeker.test;

import java.util.ArrayList;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class MyAutoCompleteTextView extends EditText {

	Context context = null;
	MyTextWatcher myTextWatcher =null;
	MyItemOnclik myItemOnclik=null;
	
	private final int  POPVIEW_HEIGHT=400;
	
	
//	OnItemClickListener onItemClickListener=null;
	public MyAutoCompleteTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		this.context = context;
		setPopw();
		this.addTextChangedListener(watcher);
	}
	
	/**
	 * ����Ҫ����ͼ�ӽ�ȥ�ĸ�����
	 * @param layout ֻ����Relative�����֣������linear������һ������
	 */
	public void setFatherRelativeLayouyt(RelativeLayout layout){
		this.relativeLayout = layout;
		isRLayout = true;
	}
	
	/**
	 * ����Ҫ����ͼ�ӽ�ȥ�ĸ�����
	 * @param layout ֻ����Linear�����֣������Relative������һ������
	 */
	public void setFatherLinearLayout(LinearLayout layout){
		this.linearLayout = layout;
		isRLayout = false;
	}
	
	/**
	 * �����������ݵ����ֿ�
	 * @param list
	 */
	public void setMemoryData(ArrayList<String> list){
		this.memoryData = list;
	}
	/**
	 * ���Ҫ�Դ���������TextWatch��������ʹ�ô˷�������Ҫ��ϵͳ��
	 * @param myTextWatcher
	 */
	public void addMyTextWatcher(MyTextWatcher myTextWatcher){
		this.myTextWatcher = myTextWatcher;
	}
	
	public void addMyItemOnclik(MyItemOnclik myItemOnclik){
        this.myItemOnclik = myItemOnclik;
    }
	
	
	public void removeMyTextWatcher(){
		this.myTextWatcher = null;
	}
	
//	public void setMyOnItemClickListener(OnItemClickListener myOnItemClickListener){
//        this.onItemClickListener = myOnItemClickListener;
//        System.out.println("-hj-onItemClickListener-->"+onItemClickListener);
//    }
	
	
	
	/**
	 * �ֶ����ص����������ʾ
	 */
	public void removeTheShowView(){
		if(popView.isShown()){
			if(isRLayout){
				relativeLayout.removeView(popView);
			}else{
				linearLayout.removeView(popView);
			}
		}
	}
    /**
     * 显示popView
     */
       public void showpopView(){
           mList.clear();
           mList.addAll(memoryData);
           if(mList.size()>0){
               mAdapter.notifyDataSetInvalidated();
               if(!popView.isShown()){
                   int[] top = new int[2];
                   MyAutoCompleteTextView.this.getLocationInWindow(top);
                   //显示位置稍有不和，可自行修改，这里我就偷懒了
                   layoutParams.topMargin = top[1]+150;
                   layoutParams.leftMargin = top[0];
                   layoutParams.rightMargin=40;
                   if(memoryData.size()>=4){
                       layoutParams.height=POPVIEW_HEIGHT;
                   }
//                   layoutParams.width
                   
                   if(isRLayout){
                       relativeLayout.addView(popView,layoutParams);
                   }else{
                       linearLayout.addView(popView,layoutParams);
                   }
                   popView.setFocusable(true);
               }
           }
        }
    
	
	public boolean isListShowing(){
		return popView.isShown();
	}
	TextWatcher watcher = new TextWatcher() {
		
		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count) {
			// TODO Auto-generated method stub
			mList.clear();
			mList.addAll(getSimilarString(String.valueOf(s), memoryData));
			if(mList.size()>0){
				mAdapter.notifyDataSetInvalidated();
				if(!popView.isShown()){
					int[] top = new int[2];
					MyAutoCompleteTextView.this.getLocationInWindow(top);
					//��ʾλ�����в��ͣ��������޸ģ������Ҿ�͵����
					layoutParams.topMargin = top[1]+150;
					layoutParams.leftMargin = top[0];
					layoutParams.rightMargin=40;
//					 layoutParams.height=POPVIEW_HEIGHT;
					 if(memoryData.size()>=4){
	                       layoutParams.height=POPVIEW_HEIGHT;
	                   }
					 
					if(isRLayout){
						relativeLayout.addView(popView,layoutParams);
					}else{
						linearLayout.addView(popView,layoutParams);
					}
					popView.setFocusable(true);
				}else{
				    
				    int[] top = new int[2];
                    MyAutoCompleteTextView.this.getLocationInWindow(top);
                    layoutParams.topMargin = top[1]+150;
                    layoutParams.leftMargin = top[0];
                    layoutParams.rightMargin=40;
				    if(mList.size()<=4){
		                layoutParams.height=LayoutParams.WRAP_CONTENT;
		                 }else if(mList.size()>4){
		                     layoutParams.height=POPVIEW_HEIGHT; 
		                 }
				    popView.setLayoutParams(layoutParams);    
				    
				}
				
				
				
				
			}else{
				if(isRLayout){
					relativeLayout.removeView(popView);	
				}else{
					linearLayout.removeView(popView);	
				}
			}
			if(myTextWatcher!=null){
				myTextWatcher.onTextChanged(s, start, before, count);
			}
		}
		
		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,
				int after) {
			// TODO Auto-generated method stub
			if(myTextWatcher!=null){
				myTextWatcher.beforeTextChanged(s, start, count, after);
			}
		}
		
		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub
			if(s.length() == 0){
				removeTheShowView();
			}
			if(myTextWatcher!=null){
				myTextWatcher.afterTextChanged(s);
			}
		}
	};
	
	ArrayList<String> memoryData = null;
	LayoutParams layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
	private View popView = null;
	private ListView mlistView = null;
	private ArrayList<String> mList = null;
	private ArrayAdapter<String> mAdapter = null;//popw��listview��������
	RelativeLayout relativeLayout = null;
	LinearLayout linearLayout =null;
	private boolean isRLayout = false;
	
	private void setPopw(){
		if(this.popView == null){
			popView = View.inflate(context, R.layout.popview, null);			
		}
		
		if(mlistView == null){
			mlistView = (ListView) popView.findViewById(R.id.pop_listview);
			mlistView.setItemsCanFocus(true);
//			mlistView.setOnItemClickListener(onItemClickListener);
			
			mlistView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
				    
                     String ss =mList.get(position);
                     MyAutoCompleteTextView.this.setText(ss);
				    
				    
//					MyAutoCompleteTextView.this.setText(mList.get(position));
//					String ss=mList.get(position);
//					System.out.println("----position--->"+position);
//					System.out.println("----mList--->"+mList);
					System.out.println("----ss--->"+ss);
					myItemOnclik.ItemOnclik(ss);
					
					if(isRLayout){
						relativeLayout.removeView(popView);
					}else{
						linearLayout.removeView(popView);
					}
				}
			});
		}
		mList =new ArrayList<String>();
		if(mAdapter == null){
			mAdapter = new ArrayAdapter<String>(context, R.layout.list_item, R.id.txt_item, mList);
		}
		mlistView.setAdapter(mAdapter);
	}
	
	/**
	 * ��ĳ�ַ������л�ȡǰ�����ַ������Ƶ��ַ�����
	 * <p> ���磬��׼�ַ���Ϊasd��ʱ�򣬴Ӽ�����ȡ��ȫ����asd��ͷ���ַ���
	 * @param edt �����ȽϵĻ�׼�ַ�
	 * @param datas �ַ�����
	 * @return ƥ����ַ�����
	 */
	private ArrayList<String> getSimilarString(String edt,ArrayList<String> datas){
		ArrayList<String> similars = new ArrayList<String>();
		for(String s :datas){
			if(s.startsWith(edt)){
				similars.add(s);
			}
		}
		return similars;
	}
	/**
	 * ��Ϊ�ؼ��ڲ��Ѿ����˴�ϵͳ�ӿڵ�ʵ�ּ���������ӿ����Լ����������ⲿ���õ�
	 *<p>�������ơ��ֶζ���ϵͳ�Դ���һ��,�Ͳ�׸����
	 * @author hz
	 *
	 */
	public interface MyTextWatcher{
		/**
		 * 
		 * @param s
		 * @param start
		 * @param before
		 * @param count
		 */
		public void onTextChanged(CharSequence s, int start, int before, int count);
		public void beforeTextChanged(CharSequence s, int start, int count,int after);
		public void afterTextChanged(Editable s);
	}
	
	
	public interface MyItemOnclik{
        public void ItemOnclik(String s);
    }
    
	
	
	
	
//	 @Override
//	    public void onCommitCompletion(CompletionInfo completion) {
//	       System.out.println("----hjjjj------>"+completion.getPosition());
//	     
//	    }

	
	
}
