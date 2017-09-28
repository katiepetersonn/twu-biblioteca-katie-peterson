package com.twu.biblioteca;

import java.util.Objects;
import java.util.Scanner;

public class CheckOut extends Command {

    public CheckOut(String symbol, String description) {
        super(symbol, description);
    }

    public void run(Book[] books) {
        System.out.println("Enter book title:");
        Scanner input = new Scanner(System.in);
        String bookTitle = input.nextLine();
        for (Book book : books) {
            if (Objects.equals(book.getTitle(), bookTitle)) {
                if (book.checkOut()){
                    System.out.println("Thank you! Enjoy the book.");
                    return;
                }
            }
        }
        System.out.println("That book is not available.");
    }
}