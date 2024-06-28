package com.samat_chim_minea.pizzaShop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class HomeScreens extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        RelativeLayout cardLayout = findViewById(R.id.cardLayout1);
        Button button = findViewById(R.id.circular_button);
        drawerLayout = findViewById(R.id.drawer_layout);
        Button sidebarButton = findViewById(R.id.sidebarButton);
        LinearLayout homeScreenButton = findViewById(R.id.homeButton);
        LinearLayout settingButton = findViewById(R.id.settingButton);
        LinearLayout aboutUsButton = findViewById(R.id.aboutUsButton);
        LinearLayout LogoutButton = findViewById(R.id.LogoutButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreens.this, Profile.class);
                startActivities(new Intent[]{intent});
            }
        });

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreens.this, HomeScreens.class);
                startActivities(new Intent[]{intent});
            }
        });
        LogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreens.this, HomeScreens.class);
                startActivities(new Intent[]{intent});
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreens.this, Profile.class);
                startActivities(new Intent[]{intent});
            }
        });
        aboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreens.this, AboutUs.class);
                startActivities(new Intent[]{intent});
            }
        });

        cardLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreens.this, DetailItem.class);
                startActivities(new Intent[]{intent});
            }
        });
        sidebarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });
    }
}
