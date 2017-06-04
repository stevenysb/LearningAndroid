package com.zoe.litter.drawLayout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zoe.litter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {


    public RightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_right, container, false);
        return view;
    }

    public void clickme(View view) {
        ContentFragment fragment = null;
        switch (view.getId()) {
            case R.id.bt1:
                fragment = ContentFragment.newInstance("click 1",R.color.colorAccent);
                break;
            case R.id.bt2:
                fragment = ContentFragment.newInstance("点击2",R.color.colorAccent);
                break;
            case R.id.bt3:
                fragment = ContentFragment.newInstance("点击3",R.color.colorAccent);
                break;
        }

        if (fragment != null) {
            getActivity().getFragmentManager().beginTransaction().replace(R.id.fl_content,
                    fragment).commit();

        }
    }
}
