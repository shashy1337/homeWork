package com.example.firstjavaapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstjavaapp.Adapter.ItemAdapter;
import com.example.firstjavaapp.Model.ItemModel;
import com.example.firstjavaapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<ItemModel> hands = new ArrayList<>();
        hands.add(new ItemModel(R.drawable.img, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_1, "text", "text"));
        hands.add(new ItemModel(R.drawable.img_2, "text", "text"));
        RecyclerView rv = binding.rv;
        rv.setAdapter(new ItemAdapter(hands));
        rv.setLayoutManager(new LinearLayoutManager(getBaseContext()));
    }

}