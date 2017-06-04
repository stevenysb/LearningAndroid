package com.zoe.litter.drawLayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import com.zoe.litter.R;

public class DrawLayoutActivity extends Activity implements LeftFragment.OnFragmentListener{
    private DrawerLayout dl_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawlayout2);

        initview();
    }

    private void initview() {
        dl_layout = (DrawerLayout) findViewById(R.id.dl_layout);
    }

    @Override
    public void onFragment() {
        dl_layout.closeDrawer(Gravity.LEFT);
    }

    public void clickme(View view){
        Log.d("sdfdf","fgfg");
    }
}
