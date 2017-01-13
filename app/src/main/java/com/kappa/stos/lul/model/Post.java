package com.kappa.stos.lul.model;

import java.util.ArrayList;

public class Post {
    private String title, thumbnailUrl, content, date, userName;
    private double rating;

    public Post() {
    }

    public Post(String name, String thumbnailUrl, String content, String date, double rating, String userName) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.date = date;
        this.rating = rating;
        this.userName = userName;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
