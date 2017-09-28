package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookTest {

    Book book;

    String sampleOutput;

    @Before
    public void setUp() {
        book = new Book("Harry Potter and the Philosopher's Stone", "J.K.Rowling", 2006, false);
        sampleOutput = "Harry Potter and the Philosopher's Stone |  J.K.Rowling | 1997";
    }

    @Test
    public void testGetTitle() {
        assertEquals(book.getTitle(), "Harry Potter and the Philosopher's Stone");
    }

    @Test
    public void testGetAuthor() {
        assertEquals(book.getAuthor(), "J.K.Rowling");
    }

    @Test
    public void testGetPublishedYear() {
        assertEquals(book.getAuthor(), "1997");
    }

    @Test
    public void testIsOnLoan() {
        assertTrue(!book.isOnLoan());
    }

    
}
