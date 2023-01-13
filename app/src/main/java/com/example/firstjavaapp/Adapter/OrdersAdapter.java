package com.example.firstjavaapp.Adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrdersAdapter extends RecyclerView.Adapter<ItemAdapter.ItemVH>{
    @NonNull
    @Override
    public ItemAdapter.ItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ItemVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
