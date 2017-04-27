package com.brucele.products_manager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brucele.products_manager.R;


/**
 * Created by javajiale on 2016/8/24.
 */
public class WelcomeFragment extends Fragment {

    private TextView welcome_text;

    public static WelcomeFragment newInstance(){
        WelcomeFragment f = new WelcomeFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.welcome_page, container, false);
        welcome_text = (TextView)rootView.findViewById(R.id.welcome_text);
        welcome_text.setText("欢迎您！");
        return rootView;
    }
}
