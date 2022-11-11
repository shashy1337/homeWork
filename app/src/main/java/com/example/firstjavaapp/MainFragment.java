package com.example.firstjavaapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstjavaapp.Adapter.ItemAdapter;
import com.example.firstjavaapp.Model.ItemModel;
import com.example.firstjavaapp.databinding.FragmentMainBinding;

import java.util.ArrayList;
import java.util.Objects;

public class MainFragment extends Fragment {

    private FragmentMainBinding binding = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        /*ArrayList<ItemModel> hands = new ArrayList<>();
        hands.add(new ItemModel(R.drawable.img, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_1, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_2, "text", "text"));
        RecyclerView rv = new RecyclerView(requireContext());
        rv.setAdapter(new ItemAdapter(hands));
        rv.setLayoutManager(new LinearLayoutManager(requireContext()));*/

        return binding.getRoot();
    }


}