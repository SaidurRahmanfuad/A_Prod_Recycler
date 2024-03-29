package com.saidur.prod_recycler;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.saidur.prod_recycler.Adapter.ViewPagerAdapter;
import com.saidur.prod_recycler.Fragments.Buy_Fragment;
import com.saidur.prod_recycler.Fragments.Sell_Fragment;
import com.saidur.prod_recycler.Screens.Popup_menu;

import static com.saidur.prod_recycler.R.*;
import static com.saidur.prod_recycler.R.id.navigation_home;
import static com.saidur.prod_recycler.R.layout.*;


public class MainActivity extends AppCompatActivity {
    TabLayout tabMenu;
    ViewPager viewPager;
    DrawerLayout drawer;
    FloatingActionButton fabmenu,fabadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        fabmenu=findViewById(id.fab_menu);
        fabadd=findViewById(id.fab_add);
        drawer = findViewById(R.id.drawer);
        tabMenu     = findViewById(R.id.tabMenu);
        viewPager   = findViewById(R.id.viewPager);

        setupViewPager(viewPager);

        tabMenu.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(0);  // 0 = sell , 1=Buy
        fabclick();
    }

    private void fabclick() {
        fabmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawer.isDrawerOpen(Gravity.RIGHT))
                {
                    drawer.closeDrawer(Gravity.RIGHT);
                }
                else
                {
                    drawer.openDrawer(Gravity.RIGHT);
                }
            }
        });

        fabadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Buy_Fragment(),"Buy Items");
        adapter.addFragment(new Sell_Fragment(),"Sell");

        viewPager.setAdapter(adapter);
    }


}
