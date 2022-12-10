package com.example.firstjavaapp.View;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstjavaapp.Adapter.ItemAdapter;
import com.example.firstjavaapp.Model.ItemModel;
import com.example.firstjavaapp.R;
import com.example.firstjavaapp.databinding.ActivityMainBinding;
import com.example.firstjavaapp.databinding.FragmentMainBinding;
import com.example.firstjavaapp.helper.OnClickListener;

import java.util.ArrayList;
import java.util.Objects;

public class MainFragment extends Fragment {

    private FragmentMainBinding binding = null;
    private final ArrayList<ItemModel> hands = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        initRv();
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void initRv(){
        hands.add(new ItemModel(R.drawable.img, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_1, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_2, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_2, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_2, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_2, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_2, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_2, "text", "text"));
        hands.add(new ItemModel(R.drawable.img, "text", "text"));
        FragmentActivity fragmentActivity = this.requireActivity();
        ItemAdapter adapter = new ItemAdapter(((MainActivity) fragmentActivity)::launchDetailsFragment);
        RecyclerView rv = binding.rv;
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.addData(hands);
    }
}