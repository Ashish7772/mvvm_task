package com.example.task.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.task.models.Product;

public class MainViewModel extends AndroidViewModel {

    Product product;

    public MainViewModel(@NonNull Application application) {
        super(application);
        product = new  Product("Welcome to the future of finance", "Make your money work hard","I already have an account");
    }

    public  Product getProduct()
    {
        return this.product ;
    }
}
