package com.mine.retest.compose;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;


/**
 * 功能描述：recyclerview的公用adapter
 * 使用示范：
 * @author (作者) tom
 * @version (版本) 1.0
 * @date (开发日期) 2017/2/17
 * @modify (最后修改时间)
 * @修改人 ：tom
 * @审核人 ：
 * @since (该版本支持的JDK版本) ：JDK 1.6或以上
 */
public abstract class CommRecyclerAdapter<T> extends RecyclerView.Adapter<ViewHolder> {
    private List<T> items;
    private int layoutId;
    private Context mContext;
    public CommRecyclerAdapter(Context mContext, List<T> ts, int layoutId) {
        super();
        this.mContext = mContext;
        this.items = ts;
        this.layoutId = layoutId;
    }

    public CommRecyclerAdapter(Context mContext, T[] ts, int layoutId) {
        super();
        this.mContext = mContext;
        this.items = Arrays.asList(ts);
        this.layoutId = layoutId;
    }

    public void clear(){
        items.clear();
    }

    public void addAll(List<T> additems){
        this.items.addAll(additems);
    }

    public void add(int index ,T t){
        this.items.add(index,t);
    }

    public void add(T t){
        this.items.add(t);
    }

    public List<T> getDatas(){
        return items;
    }

    public void remove(int index){
        this.items.remove(index);
    }

    public abstract void  convert(ViewHolder holder,T t,int position);

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ViewHolder.get(mContext,parent,layoutId);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        convert( holder,items.get(position),position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
