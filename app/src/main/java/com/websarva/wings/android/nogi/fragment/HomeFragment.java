package com.websarva.wings.android.nogi.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.websarva.wings.android.nogi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private WebView myWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
       myWebView = (WebView)view.findViewById(R.id.wbTwitter);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.yahoo.co.jp/");

        return view;
    }
}


