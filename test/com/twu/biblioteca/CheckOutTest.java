package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckOutTest {

    CheckOut choice;
    private Book[] books;

    @Before
    public void setUp() {
        choice = new CheckOut("C", "Check out a book");
        books = new Book[] {
                new Book("Harry Potter and the Philosopher's Stone", "J.K.Rowling", 1997, false),
                new Book("A Town Like Alice", "Nevil Shute", 1950, false),
                new Book("The Alchemist", "Paulo Coelho", 1988, false),
                new Book("The Kite Runner", "Khaled Hosseini", 2003, false),
        };
    }

    @Test
    public void testCheckOutValidBook() {
        choice.run(books);
        assertTrue(books[2].isOnLoan());

    }

    @Test
    public void testSuccessfulCheckOut() {

    }

    @Test
    public void unsuccessfulCheckOut() {

    }
}
