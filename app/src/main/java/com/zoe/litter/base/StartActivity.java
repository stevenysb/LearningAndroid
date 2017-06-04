package com.zoe.litter.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zoe.litter.R;
import com.zoe.litter.drawLayout.DrawLayoutActivity;
import com.zoe.litter.toolBar.ToolBarActivity;


public class StartActivity extends Activity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initView();
    }

    private void initView() {
        ListView lv_list = (ListView) findViewById(R.id.lv_list);
        lv_list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, new String[]{"drawLayout","toolBar"}));
        lv_list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(this, DrawLayoutActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, ToolBarActivity.class));
                break;
        }
    }
}
