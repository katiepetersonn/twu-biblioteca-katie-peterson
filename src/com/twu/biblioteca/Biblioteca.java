package com.twu.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Biblioteca self = new Biblioteca();

        self.open();

//        System.out.println(self.getWelcomeMessage());
        System.out.println(self.listBooks());
    }

    public String welcomeMessage = "Welcome to Biblioteca!";
    public String menu = "L: List Books";



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
        return menu;
    }

    public Book[] getBooks() {
        return books;
    }


    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String listBooks() {
        String result = "";
        for (Book book: books) {
            result += String.format("%s | %s | %s\n", book.getTitle(), book.getAuthor(), book.getYearPublished());
        }
        return result;
     }

     public void open() {
        System.out.println(getWelcomeMessage() +  "\n\n" + getMenu());
     }
    }

