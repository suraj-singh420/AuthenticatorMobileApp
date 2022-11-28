package com.example.authenticatormobileapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.authenticatormobileapp.R;
import com.example.authenticatormobileapp.databinding.ActivitySecondSplashScreenBinding;

public class SecondSplashScreenActivity extends AppCompatActivity {
    private ActivitySecondSplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second_splash_screen);
        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondSplashScreenActivity.this, RegistrationActivity.class));

            }
        });
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondSplashScreenActivity.this, LoginActivity.class));

            }
        });

    }
}