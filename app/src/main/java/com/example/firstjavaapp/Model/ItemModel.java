package com.example.firstjavaapp.Model;

import androidx.annotation.DrawableRes;


public class ItemModel {

    @DrawableRes
    private final int picRes;
    private final String title;
    private final String description;

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
