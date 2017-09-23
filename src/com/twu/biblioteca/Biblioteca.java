package com.twu.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Biblioteca self = new Biblioteca();

        System.out.println(self.welcomeMessage());
        System.out.println(self.listBooks());
    }


    private Book[] books = new Book[] {
                new Book(
                        "Harry Potter and the Philosopher's Stone",
                        "J.K.Rowling",
                        1997),
            new Book("A Town Like Alice", "Nevil Shute", 1950),
            new Book("The Alchemist", "Paulo Coelho", 1988),
            new Book("The Kite Runner", "Khaled Hosseini", 2003),

    };

    public String getMenu(){
        return "L: List Books";
    }

    public Book[] getBooks() {
        return books;
    }


    public String welcomeMessage() {
        return "Welcome to Biblioteca!";
    }

    public String listBooks() {
        String result = "";
        for (Book book: books) {
            result += String.format("%s | %s | %s\n", book.getTitle(), book.getAuthor(), book.getYearPublished());
        }
        return result;
     }
    }

