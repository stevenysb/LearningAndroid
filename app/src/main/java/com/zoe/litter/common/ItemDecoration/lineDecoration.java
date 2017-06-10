package com.zoe.litter.common.ItemDecoration;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.zoe.litter.R;

/**
 * Created by realtek on 2017/6/9.
 */

public class lineDecoration extends RecyclerView.ItemDecoration {

    private int dividerHeight;

    public lineDecoration(Context context) {
        super();
        dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.line_height);
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State
            state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = dividerHeight;
    }



}
