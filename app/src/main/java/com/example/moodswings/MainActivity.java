package com.example.moodswings;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BottomNavigationView  bottomNav = findViewById(R.id.nav_view);
        final FirebaseAuth mAuth = FirebaseAuth.getInstance();

        // bottomNav.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();



    // Bottom Navigation
    BottomNavigationView bottomNavigationView= findViewById(R.id.nav_view);
    bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.navigation_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.navigation_dashboard:
                            selectedFragment = new dashboardFragment();
                            break;
                        case R.id.navigation_notifications:
                            selectedFragment = new NotificationFragment();
                            break;
                        case R.id.navigation_logout:

                            Toast.makeText(MainActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();

                            // LogOut
                            mAuth.signOut();

                            selectedFragment = new LoginFragment();
                            break;
                    }
            assert selectedFragment != null;
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    return true;
                }
            });

    }
}
