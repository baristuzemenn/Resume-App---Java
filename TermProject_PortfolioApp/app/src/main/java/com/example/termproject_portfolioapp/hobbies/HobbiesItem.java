package com.example.termproject_portfolioapp.hobbies;

import java.io.Serializable;

public class HobbiesItem implements Serializable {

    private int image;
    private String title,description;

    public HobbiesItem() {
    }

    public HobbiesItem(int image) {
        this.image = image;
        this.title = title;
    }

    public HobbiesItem(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
