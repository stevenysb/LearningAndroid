package com.zoe.litter.toolBar;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.zoe.litter.R;

public class ToolBarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar tl_bar = (Toolbar) findViewById(R.id.tl_bar);
        tl_bar.inflateMenu(R.menu.toolbar_menu);
        tl_bar.setNavigationIcon(R.mipmap.ic_drawer_home);

        tl_bar.setTitle(R.string.home_page);
        tl_bar.setTitleTextColor(getResources().getColor(android.R.color.white));

    }

}
