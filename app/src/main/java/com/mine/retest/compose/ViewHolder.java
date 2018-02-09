package com.mine.retest.compose;


import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 功能描述：recyclerview的公用viewholder，配合CommRecyclerAdapter一起使用较为方便
 * 使用示范：
 * @author (作者) tom
 * @version (版本) 1.0
 * @date (开发日期) 2017/6/15
 * @modify (最后修改时间)
 * @修改人 ：tom
 * @审核人 ：
 * @since (该版本支持的JDK版本) ：JDK 1.6或以上
 */
public class ViewHolder extends RecyclerView.ViewHolder{

	private SparseArray<View> mViews;
	private View mConvertView;
	private Context mContext;
	private int left;
	private int top;
	private int right;
	private int bottom;

	public void setTextViewMargins(int left,int top,int right, int bottom) {
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}

	public ViewHolder(Context context, ViewGroup parent, View itemView) {
		super(itemView);
		this.mViews=new SparseArray<View>();
		this.mContext = context;
		mConvertView = itemView;
	}
	public static ViewHolder get(Context context, ViewGroup parent, int layoutId){
		View itemView = LayoutInflater.from(context).inflate(layoutId,parent,false);
		return new ViewHolder(context,parent,itemView);
	}

	public <T extends View> T getView(int viewId){
		
		View view=mViews.get(viewId);
		if(view==null){
			view =mConvertView.findViewById(viewId);
			mViews.put(viewId, view);
			
		}
		return (T) view;
	}
	public ViewHolder setOnClickListener(int viewId, View.OnClickListener listener){
		View view = getView(viewId);
		view.setOnClickListener(listener);
		return this;
	}

	public ViewHolder setVisible(int viewId,int avisible){
		View view = getView(viewId);
		view.setVisibility(avisible);
		return this;
	}
	
	public ViewHolder setText(int viewId,String text){
		TextView tv=getView(viewId);
		tv.setText(text);
		return this;
	}
	public ViewHolder setTextWithSize(int viewId, String text, float size){
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
				LinearLayout.LayoutParams.WRAP_CONTENT);
		TextView tv=getView(viewId);
		tv.setText(text);
		tv.setTextSize(size);
		layoutParams.setMargins(left,top,right,bottom);
		tv.setLayoutParams(layoutParams);
		return this;
	}
	public ViewHolder setImageResource(int viewId ,int resId){
		ImageView tv=getView(viewId);
		tv.setImageResource(resId);
		return this;
	}
	public ViewHolder setImageBitmap(int viewId ,Bitmap bm){
		ImageView tv=getView(viewId);
		tv.setImageBitmap(bm);
		return this;
	}

	public ViewHolder setImageButtoBacground(int viewId , int resId ){
		ImageButton view=getView(viewId);
		view.setBackgroundResource(resId);
		return this;
	}

	public View getConvertView(){
		return mConvertView;
	}


	public ViewHolder setTextColor(int viewId, int corlorId) {
		TextView tv=getView(viewId);
		tv.setTextColor(mContext.getResources().getColor(corlorId));
		return this;
	}
}
