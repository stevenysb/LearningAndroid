package com.zoe.litter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zoe.litter.R;

import java.util.List;

/**
 * Created by realtek on 2017/6/10.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    List<String> mDatas;
    Context mContext;

    public MyAdapter(Context context, List<String> datas) {
        mContext = context;
        mDatas = datas;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new MyHolder(LayoutInflater.from(mContext).inflate(R.layout
                .item_list, parent, false));

    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.tv_title.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView tv_title;

        public MyHolder(View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
