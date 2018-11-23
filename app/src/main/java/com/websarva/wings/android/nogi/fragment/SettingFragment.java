package com.websarva.wings.android.nogi.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.websarva.wings.android.nogi.R;
import com.websarva.wings.android.nogi.sendmail;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {


    public SettingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_setting, container, false);

        ListView list = (ListView) view.findViewById(R.id.lvSetting);
        String[] item01 = getResources().getStringArray(R.array.setting);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, item01);
        list.setAdapter(adapter);

        // リスト項目がクリックされた時の処理
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                String strData = adapter.getItem(position);


                switch (position) {
                    case 0:
                        Intent saito = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://mt.nogizaka46.com/"));
                        startActivity(saito);
                        break;
                    case 1:
                        Intent shop = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nogizaka46shop.com/"));
                        startActivity(shop);
                        break;
                    case 2:
                        Intent tv = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tv.yahoo.co.jp/search/?q=%E4%B9%83%E6%9C%A8%E5%9D%8246&g=&Submit.x=0&Submit.y=0"));
                        startActivity(tv);
                        break;
                    case 3:
                        Intent otoiawase = new Intent(getActivity(),sendmail.class);
                        startActivity(otoiawase);
                        break;


                }
            }
        });
        return view;
    }

}
