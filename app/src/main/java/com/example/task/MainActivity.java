package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import com.example.task.databinding.ActivityMainBinding;
import com.example.task.models.Product;
import com.example.task.viewModels.MainViewModel;

public class MainActivity extends AppCompatActivity {
    MainViewModel mainViewModel ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainxml = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Product product = new Product("Welcome to the future of finance", "Make your money work hard","I already have an account");


        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        mainxml.setProduct(mainViewModel.getProduct());
    }
}