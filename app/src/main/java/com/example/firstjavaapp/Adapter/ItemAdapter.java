package com.example.firstjavaapp.Adapter;

import android.annotation.SuppressLint;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstjavaapp.Model.ItemModel;
import com.example.firstjavaapp.databinding.ItemBinding;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemVH> {

    private final ArrayList<ItemModel> itemModels = new ArrayList<>();
    private ItemBinding binding = null;


    public static class ItemVH extends RecyclerView.ViewHolder {

        private final ItemBinding binding;

        public ItemVH(ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
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
        binding = ItemBinding
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

    @SuppressLint("NotifyDataSetChanged")
    public void addData(ArrayList<ItemModel> items){
        itemModels.addAll(items);
        notifyDataSetChanged();
    }

}
