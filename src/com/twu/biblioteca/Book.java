package com.twu.biblioteca;

public class Book extends Resource{
    private String author;
    private Integer yearOfPublishing;
    private User user;

    public Book(String title, String author, Integer yearOfPublishing) {
        super(title);
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void checkOut() {
        super.checkOut();
        this.user = UI.getUser();
    }

    public String toFormattedString() {
        return String.format("%-40s %-25s %-30d", super.getTitle(), author, yearOfPublishing);
    }

    public String toFormattedStringWithUser() {
        return String.format("%-10s %-40s %-25s %-10d", user.getId(), super.getTitle(), author, yearOfPublishing);
    }

    public void returnBook() {
        super.setAvailable(true);
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYearOfPublishing() {
        return yearOfPublishing;
    }

    public User getUser() {
        return user;
    }
}
