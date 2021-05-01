package com.example.microsoft_tech_club_isimm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Member_of_the_month extends AppCompatActivity {
   public  FragmentAdapter adapter ;
    ViewPager viewpager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_of_the_month);
        TabLayout tablayout = findViewById(R.id.tabBar);
        TabItem memberofthemonthTab = findViewById(R.id.mmofthemonthTab);
        TabItem risingstarTab = findViewById(R.id.risingstarTab);

        viewpager = findViewById(R.id.viewpagerTab);
        adapter = new FragmentAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        viewpager.setAdapter(adapter);
        viewpager.addOnPageChangeListener(new TabLayout
                .TabLayoutOnPageChangeListener(tablayout));
        // change fragement when i click on  tab item
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());

              //  tablayout = String.valueOf(tab.getText());
                Log.d("hhlo", String.valueOf(tab.getText()));

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }
}