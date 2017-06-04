package com.zoe.litter.drawLayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.zoe.litter.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;

public class DrawLayout2Activity extends AppCompatActivity implements ListView.OnItemClickListener {

    private ListView lv_list;
    private DrawerLayout dl_layout;

    private List<Map<String, Object>> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();

        ButterKnife.bind(this);
    }

    private void initView() {

        lv_list = (ListView) findViewById(R.id.lv_list);
        lv_list.setAdapter(new SimpleAdapter(this, lists, android.R.layout.activity_list_item,
                new String[]{"image", "text"}, new int[]{android.R.id.icon, android.R.id.text1}));

        //lv_list.setOnItemSelectedListener(this);
        lv_list.setOnItemClickListener(this);
        dl_layout = (DrawerLayout) findViewById(R.id.dl_layout);

    }

    private void initData() {

        lists = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = null;
        map = new HashMap<String, Object>();
        map.put("image", R.mipmap.iv_menu_realtime);
        map.put("text", getString(R.string.shishi));
        lists.add(map);

        map = new HashMap<String, Object>();
        map.put("image", R.mipmap.iv_menu_alert);
        map.put("text", getString(R.string.tixing));
        lists.add(map);

        map = new HashMap<String, Object>();
        map.put("image", R.mipmap.iv_menu_trace);
        map.put("text", getString(R.string.huodong));
        lists.add(map);

        map = new HashMap<String, Object>();
        map.put("image", R.mipmap.iv_menu_settings);
        map.put("text", getString(R.string.xiangguan));
        lists.add(map);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment = BlankFragment.newInstance(lists.get(position).get("text").toString());
        getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).commit();
        dl_layout.closeDrawer(Gravity.START);


    }
}
