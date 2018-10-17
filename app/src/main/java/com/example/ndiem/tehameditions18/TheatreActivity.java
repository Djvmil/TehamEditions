package com.example.ndiem.tehameditions18;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class TheatreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatre);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_roman:
                        Intent intentRoman = new Intent(TheatreActivity.this,RomanActivity.class);
                        startActivity(intentRoman);
                        break;
                    case R.id.nav_essai:
                        Intent intentEssai = new Intent(TheatreActivity.this,EssaiActivity.class);
                        startActivity(intentEssai);
                        break;
                    case R.id.nav_theatre:
                        Intent intentTheatre = new Intent(TheatreActivity.this,TheatreActivity.class);
                        startActivity(intentTheatre);
                        break;
                    case R.id.nav_conte:
                        Intent intentConte = new Intent(TheatreActivity.this,ConteActivity.class);
                        startActivity(intentConte);
                        break;

                }

                return false;
            }
        });
    }
}
