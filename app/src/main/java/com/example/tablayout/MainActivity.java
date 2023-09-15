package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
TabItem chats, status, calls;
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout= findViewById(R.id.tabLayout);
        status=findViewById(R.id.tabStatus);
        calls=findViewById(R.id.tabCalls);
        viewPager=findViewById(R.id.viewpager);
      //initialising the Pager adapter
        MyPagerAdapter pagerAdapter= new MyPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        // It is used to join TabLayout with ViewPager.
        tabLayout.setupWithViewPager(viewPager);

    }
}