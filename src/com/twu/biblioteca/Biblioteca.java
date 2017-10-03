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
    private String[] validInputs = new String[] {"L", "C", "Q","R"};
    private String menu =
                "L: List available books" + "\n" + "C: Check out a book" + "\n" + "R: Return a Book";


    private Book[] books = new Book[] {
                new Book(
                        "Harry Potter and the Philosopher's Stone",
                        "J.K.Rowling",
                        1997, false),
            new Book("A Town Like Alice", "Nevil Shute", 1950, false),
            new Book("The Alchemist", "Paulo Coelho", 1988, false),
            new Book("The Kite Runner", "Khaled Hosseini", 2003, false),

    };

    public String getMenu(){
        return menu;
    }


    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public Book[] getBooks() {
        return books;
    }


    public void open() {

        System.out.println(getWelcomeMessage() + "\n\n" + getMenu());
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
        } else if (Objects.equals (command, "R")) {
            System.out.println("Enter your book title that you would like to return:");
            Scanner input = new Scanner(System.in);
            String bookTitle = input.nextLine();
            returnBooks(bookTitle);
        } else if (Objects.equals (command, "C")) {
            System.out.println("Enter book title:");
            Scanner input = new Scanner(System.in);
            String bookTitle = input.nextLine();
            checkOut(bookTitle);
        }
//        System.out.println("Select a valid option!");
    }

    public void checkOut(String bookTitle) {
        for (Book book : books) {
            if (!Objects.equals(book.getTitle(), bookTitle)) {
                if (book.checkOut()){
                    System.out.println("Thank you! Enjoy the book.");
                    return;
                }
            }
            else {
                System.out.println(bookTitle);
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

    public void returnBooks(String bookTitle) {
        for (Book book : books) {
            if (!Objects.equals(book.getTitle(), bookTitle)) {
                if (book.checkOut()){
                    System.out.println("Thank you for returning the book");
                    return;
                }
            }
            else {
                System.out.println("That is not a valid book to return.");
                return;
            }
        }
    }


    private boolean isValidCommand(String command) {
        return Arrays.asList(validInputs).contains(command);
    }

}

