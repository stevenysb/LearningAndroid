package com.zoe.litter.drawLayout;


import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zoe.litter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment implements View.OnClickListener {
    private OnFragmentListener mListener;

    public LeftFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_left, container, false);
        ImageView iv_image = (ImageView) view.findViewById(R.id.iv_image);
        iv_image.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(mListener != null){
            mListener.onFragment();
        }
        startActivity(new Intent(getActivity(),MainActivity.class));
    }

    public interface OnFragmentListener {
        // TODO: Update argument type and name
        void onFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentListener) {
            mListener = (OnFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
}
