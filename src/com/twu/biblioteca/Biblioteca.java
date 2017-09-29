package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Biblioteca self = new Biblioteca();

        self.open();
        self.run();

    }

    private String welcomeMessage = "Welcome to Biblioteca!";
    private String[] validInputs = new String[] {"L", "C", "Q"};


    private Book[] books = new Book[] {
                new Book(
                        "Harry Potter and the Philosopher's Stone",
                        "J.K.Rowling",
                        1997, false),
            new Book("A Town Like Alice", "Nevil Shute", 1950, false),
            new Book("The Alchemist", "Paulo Coelho", 1988, false),
            new Book("The Kite Runner", "Khaled Hosseini", 2003, false),

    };

//    public String getMenu(){
//        return menu;
//    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public Book[] getBooks() {
        return books;
    }


    public void open() {
        System.out.println(getWelcomeMessage());
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        String command = scan.next().substring(0, 1);
        while (!Objects.equals(command, "Q")) {
            handleCommandFunction(command);
//            respondToInput(command);
            command = scan.next().substring(0, 1);
        }
    }

    public void handleCommandFunction(String command ) {
        System.out.println(command);
        if (Objects.equals (command, "L")) {
            listBooks();
        } else {
            System.out.println("Enter book title:");
            Scanner input = new Scanner(System.in);
            String bookTitle = input.nextLine();
            checkOut(bookTitle);
        }
//        System.out.println("Select a valid option!");
    }

    public void checkOut(String bookTitle) {

        for (Book book : books) {
//            System.out.println(book);
            if (Objects.equals(book.getTitle(), bookTitle)) {
                if (book.checkOut()){
                    System.out.println("Thank you! Enjoy the book.");
                    return;
                }
            }
            else {
                System.out.println("That book is not available.");
                return;
            }

        }

    }

    public String listBooks() {
        String result = "";
        for (Book book: books) {
            if(!book.isOnLoan()) {
                result += book.toString() + "\n";
            }
        }
        System.out.println(result);
        return result;
    }



    private boolean isValidCommand(String command) {
        return Arrays.asList(validInputs).contains(command);
    }

}

