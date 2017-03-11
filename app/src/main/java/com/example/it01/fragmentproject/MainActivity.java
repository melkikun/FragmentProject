package com.example.it01.fragmentproject;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.it01.fragmentproject.adapter.ListAdapter;
import com.example.it01.fragmentproject.adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout.addTab(tabLayout.newTab().setText("Tab1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        ListView listView = (ListView) findViewById(R.id.lv);
        String [] nama = new String[]{"1", "2"};
        ListAdapter listAdapter = new ListAdapter(nama, getApplicationContext());
        listView.setAdapter(listAdapter);
    }
}
