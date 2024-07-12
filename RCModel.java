package com.example.movieapp;

public class RCModel {
    String name,movie;
    int movieImg;

    public String getName() {
        return name;
    }

    public String getMovie() {
        return movie;
    }

    public int getMovieImg() {
        return movieImg;
    }

    public RCModel(String name, String movie, int movieImg) {
        this.name = name;
        this.movie = movie;
        this.movieImg = movieImg;
    }
}
