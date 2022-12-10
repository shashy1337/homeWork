package com.example.firstjavaapp.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstjavaapp.Adapter.ItemAdapter;
import com.example.firstjavaapp.Model.ItemModel;
import com.example.firstjavaapp.R;
import com.example.firstjavaapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private  NavController navController = null;
    private ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        navController = Navigation.findNavController(this, R.id.myNavHostController);
        initBottomBar();
    }

    private void initBottomBar(){
        NavigationUI.setupWithNavController(binding.lowerMenu, navController);
    }

    public void launchDetailsFragment(ItemModel itemModel){
        navController
                .navigate(MainFragmentDirections
                        .actionMainFragmentToDetailsFragment(itemModel));
    }

    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();
    }
}