package com.websarva.wings.android.nogi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.websarva.wings.android.nogi.fragment.HomeFragment;
import com.websarva.wings.android.nogi.fragment.MembersFragment;
import com.websarva.wings.android.nogi.fragment.SettingFragment;

public class MenuActivity extends AppCompatActivity implements  BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        loadFragment(new HomeFragment());

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_members:
                fragment = new MembersFragment();
                break;

            case R.id.navigation_settings:
                fragment = new SettingFragment();
                break;

            case R.id.navigation_videos:
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/results?search_query=%E4%B9%83%E6%9C%A8%E5%9D%8246"));
                startActivity(i);
                break;




        }

        return loadFragment(fragment);


    }
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}