package com.example.ndiem.tehameditions18.roman;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ndiem.tehameditions18.class_livres_auteurs.AuteurList;
import com.example.ndiem.tehameditions18.R;
import com.example.ndiem.tehameditions18.class_livres_auteurs.RomanList;
import com.example.ndiem.tehameditions18.class_livres_auteurs.SectionStatePagerAdapter;
import com.example.ndiem.tehameditions18.theatre.TheatreActivity;
import com.example.ndiem.tehameditions18.conte.ConteActivity;
import com.example.ndiem.tehameditions18.essai.EssaiActivity;


public class RomanActivity extends AppCompatActivity {
    private SectionStatePagerAdapter mSectionStatePagerAdapter = null;
    private ViewPager mViewPager = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roman);

        //Roman Activity
        mSectionStatePagerAdapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_view);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_roman);
        tabLayout.setupWithViewPager(mViewPager);

        tabLayout.getTabAt(0).setText("Livres");
        tabLayout.getTabAt(1).setText("Auteurs");
        tabLayout.setTabTextColors(R.color.colorGray,R.color.colorPrimary);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_roman:
                        Intent intentRoman = new Intent(RomanActivity.this,RomanActivity.class);
                        startActivity(intentRoman);
                        break;
                    case R.id.nav_essai:
                        Intent intentEssai = new Intent(RomanActivity.this,EssaiActivity.class);
                        startActivity(intentEssai);
                        break;
                    case R.id.nav_theatre:
                        Intent intentTheatre = new Intent(RomanActivity.this,TheatreActivity.class);
                        startActivity(intentTheatre);
                        break;
                    case R.id.nav_conte:
                        Intent intentConte = new Intent(RomanActivity.this,ConteActivity.class);
                        startActivity(intentConte);
                        break;
                }

                return false;
            }
        });

    }

    private  void setupViewPager(ViewPager viewPager){
        SectionStatePagerAdapter adapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RomanList());
        adapter.addFragment(new AuteurList());
        viewPager.setAdapter(adapter);
    }
}
