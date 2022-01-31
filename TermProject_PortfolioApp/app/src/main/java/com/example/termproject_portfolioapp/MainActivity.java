package com.example.termproject_portfolioapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.example.termproject_portfolioapp.contact.ContactFragment;
import com.example.termproject_portfolioapp.cv.CVFragment;
import com.example.termproject_portfolioapp.education.EducationFragment;
import com.example.termproject_portfolioapp.hobbies.HobbiesFragment;
import com.example.termproject_portfolioapp.home.HomeFragment;
import com.example.termproject_portfolioapp.sidemenu.Callback;
import com.example.termproject_portfolioapp.sidemenu.MenuAdapter;
import com.example.termproject_portfolioapp.sidemenu.MenuItem;
import com.example.termproject_portfolioapp.sidemenu.MenuUtil;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements Callback {

    RecyclerView menuRv;
    List<MenuItem> menuItems;
    MenuAdapter adapter;
    int selectedMenuPos=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setupSideMenu();
        setHomeFragment();

    }


    private void setupSideMenu() {

        menuRv = findViewById(R.id.rv_side_menu);


        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems,this);
        menuRv.setLayoutManager(new LinearLayoutManager(this));
        menuRv.setAdapter(adapter);
    }

    void setHobbiesFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HobbiesFragment()).commit();
    }


    void setEducationFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new EducationFragment()).commit();
    }

    void setCVFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new CVFragment()).commit();
    }

    void setHomeFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
    }



    public void onSideMenuItemClick(int i) {

        switch (menuItems.get(i).getCode()) {

            case MenuUtil.HOME_FRAGMENT_CODE: setHomeFragment();
            break;
            case MenuUtil.EDUCATION_FRAGMENT_CODE: setEducationFragment();
            break;
            case MenuUtil.CV_FRAGMENT_CODE: setCVFragment();
            break;
            case MenuUtil.HOBBIES_FRAGMENT_CODE: setHobbiesFragment();
            break;


            default: setHomeFragment();
        }

        menuItems.get(selectedMenuPos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPos = i;
        adapter.notifyDataSetChanged();

    }
}