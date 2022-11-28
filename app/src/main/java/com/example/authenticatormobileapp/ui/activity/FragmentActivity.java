package com.example.authenticatormobileapp.ui.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.authenticatormobileapp.R;
import com.example.authenticatormobileapp.custom.CustomFragmentManager;
import com.example.authenticatormobileapp.databinding.ActivityFragmentBinding;
import com.example.authenticatormobileapp.ui.fragment.DashboardFragment;
import com.example.authenticatormobileapp.ui.fragment.ProfileFragment;
import com.google.android.material.navigation.NavigationView;

public class FragmentActivity extends AppCompatActivity {
    private ActivityFragmentBinding binding;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fragment);
        CustomFragmentManager.addFragment(getSupportFragmentManager(),new DashboardFragment());
        binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        CustomFragmentManager.replaceFragment(getSupportFragmentManager(),new ProfileFragment(),true);
                        binding.drawerLayout.closeDrawer(GravityCompat.START);

                        break;

                }
                return false;
            }
        });


    }
}