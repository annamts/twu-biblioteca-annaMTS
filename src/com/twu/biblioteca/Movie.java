package com.twu.biblioteca;

public class Movie extends Resource {
    String director;
    Integer year;
    Double rating;

    public Movie(String title, String director, Integer year, Double rating) {
        super(title);
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String toFormattedString() {
        return String.format("%-40s %-25s %-10d %-20.1f", super.getTitle(), director, year, rating);
    }


    public String getDirector() {
        return director;
    }

    public Integer getYear() {
        return year;
    }

    public Double getRating() {
        return rating;
    }
}
