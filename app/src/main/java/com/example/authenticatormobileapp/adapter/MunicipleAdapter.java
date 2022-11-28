package com.example.authenticatormobileapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.authenticatormobileapp.custom.CustomFragmentManager;
import com.example.authenticatormobileapp.databinding.MunicipleLayoutBinding;
import com.example.authenticatormobileapp.ui.fragment.OtpVerifyFragment;


public class  MunicipleAdapter extends RecyclerView.Adapter<MunicipleAdapter.myviewholder> {
     private Context context;
    private boolean isComplete;

    public MunicipleAdapter(boolean isComplete){
        this.isComplete=isComplete;
    }

     @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        MunicipleLayoutBinding binding = MunicipleLayoutBinding.inflate(inflater,parent,false);

        if(isComplete){

        }

       // makeUiAccordingtoRole(binding);

        return new myviewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.binding.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomFragmentManager.replaceFragment(((AppCompatActivity) view.getContext()).getSupportFragmentManager(),new OtpVerifyFragment(),true);

            }
        });

    }

    @Override
    public int getItemCount() {
        return 15;
    }



    class myviewholder extends RecyclerView.ViewHolder {

        MunicipleLayoutBinding binding;

        public myviewholder(@NonNull MunicipleLayoutBinding binding  ) {
            super(binding.getRoot());
            this.binding=binding;


        }


    }

}

