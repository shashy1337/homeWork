package com.example.firstjavaapp.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstjavaapp.Model.ItemModel;
import com.example.firstjavaapp.databinding.ItemBinding;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemVH> {

    ArrayList<ItemModel> itemModels;

    public ItemAdapter(ArrayList<ItemModel> itemModels) {
        this.itemModels = itemModels;
    }


    public class ItemVH extends RecyclerView.ViewHolder {

        private final ItemBinding binding = null;

        public ItemVH(ItemBinding binding) {
            super(binding.getRoot());
        }

        public void onBind(ItemModel itemModel) {
            binding.title.setText(itemModel.getTitle());
            binding.description.setText(itemModel.getDescription());
            binding.itemPic.setImageResource(itemModel.getPicRes());
        }

    }

    @NonNull
    @Override
    public ItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        com.example.firstjavaapp.databinding.ItemBinding binding = ItemBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ItemVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemVH holder, int position) {
        holder.onBind(itemModels.get(position));
    }

    @Override
    public int getItemCount() {
        return itemModels.size();
    }

}
