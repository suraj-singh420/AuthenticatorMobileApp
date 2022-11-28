package com.example.authenticatormobileapp.ui.fragment;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.authenticatormobileapp.R;
import com.example.authenticatormobileapp.adapter.MunicipleAdapter;
import com.example.authenticatormobileapp.databinding.CustomDilougeBinding;
import com.example.authenticatormobileapp.databinding.FragmentDashboardBinding;

/**
     Created by suraj singh rajput on 19-11-2022
 */
public class DashboardFragment extends Fragment {
    private FragmentDashboardBinding binding;
    private CustomDilougeBinding customDilougeBoxBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_dashboard,null,false);
        binding.rcv.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rcv.setAdapter(new MunicipleAdapter(false));
        binding.fabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                ViewGroup viewGroup = view.findViewById(android.R.id.content);
                customDilougeBoxBinding= CustomDilougeBinding.inflate(getLayoutInflater());
                View dialogView = LayoutInflater.from(view.getContext()).inflate(R.layout.custom_dilouge, viewGroup, false);
                builder.setView(customDilougeBoxBinding.getRoot());
                AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                customDilougeBoxBinding.btnSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        customDilougeBoxBinding.layOk.setVisibility(View.VISIBLE);
                        customDilougeBoxBinding.layInformation.setVisibility(View.GONE);


                    }
                });
                customDilougeBoxBinding.btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.dismiss();

                    }
                });

                alertDialog.setCancelable(true);
                alertDialog.show();
            }
        });

        return binding.getRoot();

    }
}