package com.zoe.litter.common.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zoe.litter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TextFragment extends Fragment {
    private final static String TAG ="TextFragment";
    private final static String arg1 ="title";


    public TextFragment() {
        // Required empty public constructor
    }

    public static TextFragment newInstance(String title) {

        Bundle args = new Bundle();

        args.putString(arg1,title);

        TextFragment fragment = new TextFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text, container, false);
        TextView mTitle = (TextView) view.findViewById(R.id.tv_title);

        String title = mTitle.getText().toString();
        Bundle arguments = getArguments();
        if(arguments != null){
            String temp = arguments.getString(arg1);
            if(!TextUtils.isEmpty(temp)){
                title = temp;
            }
        }

        mTitle.setText(title);
        return view;
    }


}
