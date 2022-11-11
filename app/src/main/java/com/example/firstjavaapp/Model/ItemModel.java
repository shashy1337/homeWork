package com.example.firstjavaapp.Model;

import androidx.annotation.DrawableRes;


public class ItemModel {

    @DrawableRes
    private int picRes;
    private String title;
    private String description;

    public ItemModel(@DrawableRes int picRes, String title, String description){
        this.picRes = picRes;
        this.title = title;
        this.description = description;
    }


    public int getPicRes() {
        return picRes;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
