package com.websarva.wings.android.nogi.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.websarva.wings.android.nogi.R;
import com.websarva.wings.android.nogi.ikki;
import com.websarva.wings.android.nogi.niki;
import com.websarva.wings.android.nogi.sanki;


/**
 * A simple {@link Fragment} subclass.
 */
public class MembersFragment extends Fragment {
    private LinearLayout ll1,ll2,ll3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_members, container, false);

        ll1 = view.findViewById(R.id.ll1);
        ll2 = view.findViewById(R.id.ll2);
        ll3 = view.findViewById(R.id.ll3);

        view.findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll1.setVisibility(View.VISIBLE);
                ll2.setVisibility(View.INVISIBLE);
                ll3.setVisibility(View.INVISIBLE);
            }
        });
        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll2.setVisibility(View.VISIBLE);
                ll1.setVisibility(View.INVISIBLE);
                ll3.setVisibility(View.INVISIBLE);
            }
        });
        view.findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll3.setVisibility(View.VISIBLE);
                ll1.setVisibility(View.INVISIBLE);
                ll2.setVisibility(View.INVISIBLE);

            }
        });

        ImageView iv1=view.findViewById(R.id.iv1);
        ImageView iv2=view.findViewById(R.id.iv2);
        ImageView iv3=view.findViewById(R.id.iv3);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ikki.class);
                startActivity(intent);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),niki.class);
                startActivity(intent);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),sanki.class);
                startActivity(intent);
            }
        });
        return view;
    }
}