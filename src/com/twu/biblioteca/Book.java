package com.twu.biblioteca;

public class Book {

    private final boolean isOnLoan;
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished, boolean isOnLoan) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isOnLoan = isOnLoan;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isOnLoan() {
        return isOnLoan;
    }
}
