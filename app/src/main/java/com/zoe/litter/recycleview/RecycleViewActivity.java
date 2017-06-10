package com.zoe.litter.recycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import com.zoe.litter.R;
import com.zoe.litter.adapter.MyAdapter;
import com.zoe.litter.common.ItemDecoration.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {

    private RecyclerView mRcvList;
    private List<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        initView();
        initData();
    }

    private void initData() {
        mDatas = new ArrayList<String>();
        mDatas = new ArrayList<String>();
        for (int i = 'A'; i < 'z'; i++) {
            mDatas.add("" + (char) i);
        }

        //mRcvList.setLayoutManager(new LinearLayoutManager(this));
        //mRcvList.setLayoutManager(new GridLayoutManager(this,4));
        mRcvList.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager
                .HORIZONTAL));
        mRcvList.setAdapter(new MyAdapter(this,mDatas));
        //mRcvList.addItemDecoration(new lineDecoration(this));
        //mRcvList.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        //mRcvList.addItemDecoration(new DividerItemDecoration(this, LinearLayout.HORIZONTAL));
        mRcvList.addItemDecoration(new DividerGridItemDecoration(this));
    }

    private void initView() {
        mRcvList = (RecyclerView) findViewById(R.id.rcv_list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_staggered,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
