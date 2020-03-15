package com.example.app;

import androidx.annotation.Nullable;

public class Card {
    private String title;
    private int imgURL;


    public Card(String title ,@Nullable  int imgURL) {

        this.title = title;
        this.imgURL = imgURL;
    }

    public int getImgURL() { return imgURL;
    }

    public void setImgURL(int imgURL) {
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
