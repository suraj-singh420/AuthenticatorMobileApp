package com.example.authenticatormobileapp.ui.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.authenticatormobileapp.R;
import com.example.authenticatormobileapp.databinding.FragmentProfileBinding;

/**
      Created by suraj singh rajput on 22-11-2022
 */
public class ProfileFragment extends Fragment {
    private FragmentProfileBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_profile,null,false);
        return binding.getRoot();

    }
}