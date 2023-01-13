package com.example.firstjavaapp.View;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstjavaapp.Model.ItemModel;
import com.example.firstjavaapp.R;
import com.example.firstjavaapp.databinding.FragmentDetailsBinding;

public class DetailsFragment extends Fragment {

    private FragmentDetailsBinding binding = null;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DetailsFragmentArgs itemArgs = DetailsFragmentArgs.fromBundle(requireArguments());
        setStuff(itemArgs.getItem());
        startFabIntent();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailsBinding
                .inflate(getLayoutInflater(), container, false);

        return binding.getRoot();
    }

    private void setStuff(ItemModel item){
        binding.toolbar.setTitle(item.getTitle());
        binding.itemPic.setImageResource(item.getPicRes());
        binding.description.setText(item.getDescription());
    }

    private void startFabIntent(){
        binding.buy.setOnClickListener(
                v -> {
                    Intent intent = new Intent(getContext(), GoogleMapActivity.class);
                    startActivity(intent);
                }
        );
    }
}