package com.zoe.litter.coordinatelayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.zoe.litter.R;
import com.zoe.litter.adapter.Tab_Adapter;
import com.zoe.litter.common.ItemFragment;
import com.zoe.litter.common.TextFragment;
import com.zoe.litter.dummy.DummyContent;

import java.util.ArrayList;
import java.util.List;

public class AppBarLayout_TabLayout_Activity extends AppCompatActivity implements
        ItemFragment.OnListFragmentInteractionListener {

    Toolbar toolbar;
    FloatingActionButton fab;
    TabLayout tablayout;
    ViewPager viewPager;

    private FragmentPagerAdapter fAdapter;                               //定义adapter

    private List<Fragment> list_fragment;                                //定义要装fragment的列表
    private List<String> list_title;                                     //tab名称列表

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout_tab_layout);

        initView();
        initData();
    }

    private void initData() {
        list_fragment = new ArrayList<>();
        list_fragment.add(ItemFragment.newInstance(1));
        list_fragment.add(TextFragment.newInstance("热门推荐"));
        list_fragment.add(TextFragment.newInstance("热门收藏"));
        list_fragment.add(TextFragment.newInstance("本月热榜"));
        list_fragment.add(TextFragment.newInstance("今日热榜"));
        list_fragment.add(TextFragment.newInstance("新闻"));
        list_fragment.add(TextFragment.newInstance("游戏"));

        list_title = new ArrayList<>();
        list_title.add("列表");
        list_title.add("热门推荐");
        list_title.add("热门收藏");
        list_title.add("本月热榜");
        list_title.add("今日热榜");
        list_title.add("新闻");
        list_title.add("游戏");

        //设置TabLayout的模式
        tablayout.setTabMode(TabLayout.MODE_FIXED);

        fAdapter = new Tab_Adapter(getSupportFragmentManager(), list_fragment, list_title);

        viewPager.setAdapter(fAdapter);
        tablayout.setupWithViewPager(viewPager);
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("appbarlayout_tablayout");
        toolbar.setTitleTextColor(Color.BLUE);
        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);

        tablayout = (TabLayout) findViewById(R.id.tabs);
        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
