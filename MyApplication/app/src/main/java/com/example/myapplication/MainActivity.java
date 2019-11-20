package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;
    TabLayout tabLayout;
    SetTabLayoutAdapter setTabLayoutAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tablayout);
        setTabLayoutAdapter=new SetTabLayoutAdapter(getSupportFragmentManager());

        viewPager.setAdapter(setTabLayoutAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
