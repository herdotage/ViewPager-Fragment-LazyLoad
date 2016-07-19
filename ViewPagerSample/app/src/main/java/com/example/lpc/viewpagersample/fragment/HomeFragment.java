package com.example.lpc.viewpagersample.fragment;

import android.os.Bundle;
import android.os.Trace;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lpc.viewpagersample.R;

/**
 * Created by lpc on 2016/7/18.
 */
public class HomeFragment extends BaseFragment {

    private String mTitle ;
    private TextView mTextView ;
    public static HomeFragment newInstance(String title) {
        HomeFragment fragment = new HomeFragment();
//        Bundle args = new Bundle() ;
//        args.putString("home_fragment_title",title);
//        fragment.setArguments(args);
        return fragment ;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mTitle = getArguments().getString("home_fragment_title") ;

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home,container,false) ;
        return v ;
    }

    @Override
    public void fetchData() {

    }
}
