package com.example.firstjavaapp.Model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.DrawableRes;

import kotlinx.android.parcel.Parcelize;

@Parcelize
public class ItemModel implements Parcelable {

    @DrawableRes
    private final int picRes;
    private final String title;
    private final String description;

    public ItemModel(@DrawableRes int picRes, String title, String description){
        this.picRes = picRes;
        this.title = title;
        this.description = description;
    }

    public static final Creator<ItemModel> CREATOR = new Creator<ItemModel>() {
        @Override
        public ItemModel createFromParcel(Parcel in) {
            int picRes = in.readInt();
            String title = in.readString();
            String description = in.readString();
            return new ItemModel(picRes, title, description);
        }

        @Override
        public ItemModel[] newArray(int size) {
            return new ItemModel[size];
        }
    };

    public int getPicRes() {
        return picRes;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(picRes);
        dest.writeString(title);
        dest.writeString(description);
    }
}
