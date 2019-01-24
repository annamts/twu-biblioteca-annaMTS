package com.twu.biblioteca;

public class Book {
    private String title;
    private  String author;
    private Integer yearOfPublishing;

    public Book(String title, String author, Integer yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String toString() {
        return String.format("%-40s", title) + String.format("%-25s", author) + String.format("%-30d", yearOfPublishing);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYearOfPublishing() {
        return yearOfPublishing;
    }
}
