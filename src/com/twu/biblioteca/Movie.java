package com.twu.biblioteca;

public class Movie {
    String name;
    String director;
    Integer year;
    Double rating;
    Boolean available;

    public Movie(String name, String director, Integer year, Double rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.available = true;
    }

    public String toFormattedString() {
        return String.format("%-40s %-25s %-10d %-20.1f", name, director, year, rating);
    }

    public String getName() {
        return name;
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

    public Boolean isAvailable() {
        return available;
    }
}
