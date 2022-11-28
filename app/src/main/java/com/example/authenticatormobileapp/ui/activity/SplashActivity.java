package com.example.authenticatormobileapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.authenticatormobileapp.R;
import com.example.authenticatormobileapp.databinding.ActivityMainBinding;

public class SplashActivity extends AppCompatActivity {
  private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.ivThumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashActivity.this, SecondSplashScreenActivity.class));

            }
        });

    }
}