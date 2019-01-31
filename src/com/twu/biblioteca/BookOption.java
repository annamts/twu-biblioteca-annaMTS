package com.twu.biblioteca;

public class BookOption extends Option{
    private Book book;

    public BookOption(Book book) {
        super(book.getTitle(), book.getTitle());
        this.book = book;
    }

    public void action() {
        if(BookManager.checkOut(book.getTitle())) {
            System.out.println("Thank you! Enjoy the book\n");
        } else {
            System.out.println("Sorry, that book is not available\n");
        }
        UI.mainMenuInteraction();
    }
}
