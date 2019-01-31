package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private Integer yearOfPublishing;
    private Boolean available;

    public Book(String title, String author, Integer yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.available = true;
    }

    public String toFormattedString() {
        return String.format("%-40s %-25s %-30d", title, author, yearOfPublishing);
    }

    public void checkOut() {
        this.available = false;
    }

    public void returnBook() {
        this.available = true;
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

    public Boolean isAvailable() {
        return available;
    }
}
