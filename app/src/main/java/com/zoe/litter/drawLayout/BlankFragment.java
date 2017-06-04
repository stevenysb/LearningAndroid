package com.zoe.litter.drawLayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zoe.litter.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
    }

    public static BlankFragment newInstance(String text){
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString("text", text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        String text = getArguments().get("text").toString();
        TextView tv_text = (TextView) view.findViewById(R.id.tv_text);
        tv_text.setText(text);

        return view;
    }

}
