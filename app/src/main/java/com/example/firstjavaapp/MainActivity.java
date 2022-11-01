package com.example.firstjavaapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstjavaapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        startButtons();
    }

    public void startButtons() {
        Button button = binding.button;
        TextView textView = binding.textView;
        button.setOnClickListener(v -> {
            textView.setText("Привет мир!");
        });
    }
}