package com.mine.retest;

import com.mine.retest.compose.CommRecyclerAdapter;
import com.mine.retest.compose.NoScrollLinearLayoutManager;
import com.mine.retest.compose.ViewHolder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 功能描述：启动类
 * 使用示范：
 * @author (作者) tom
 * @version (版本) 1.0
 * @date (开发日期) 2018/2/4
 * @modify (最后修改时间)
 * @修改人 ：tom
 * @审核人 ：
 * @since (该版本支持的JDK版本) ：JDK 1.6或以上
 */
public class StartActivity extends AppCompatActivity {

    private static final String PRE = "com.mine.retest.activity.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        RecyclerView rv = findViewById(R.id.rv);
        String[] sources = this.getResources().getStringArray(R.array.activity_list);
        rv.setLayoutManager(new NoScrollLinearLayoutManager(this));
        rv.setAdapter(new CommRecyclerAdapter<String>(this, sources, R.layout.detail_item) {
            @Override
            public void convert(ViewHolder holder, final String activity, int position) {
                holder.setText(R.id.tv, activity);
                holder.setOnClickListener(R.id.tv, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Class aClass = null;
                        try {
                            aClass = Class.forName(PRE + activity);
                        }catch (ClassNotFoundException e){

                        }
                        if(aClass != null) {
                            startActivity(new Intent(StartActivity.this,aClass));
                        }
                    }
                });
            }
        });

    }
}
