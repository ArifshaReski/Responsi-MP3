package com.example.remakegomoney_responsi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomnav ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    bottomnav = findViewById(R.id.bottomnav);
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();

    bottomnav.setOnItemSelectedListener(item -> {
        Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.home:
                    fragment = new HomeFragment();
                    break;

                    case  R.id.payment:
                        fragment = new PaymentFragment();
                        break;

                    case R.id.history:
                        fragment = new HistoryFragment();
                        break;

                    case R.id.setting:
                        fragment = new SettingFragment();
                        break;
                }
        assert fragment != null;
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();

                return true;
    });
    }
}