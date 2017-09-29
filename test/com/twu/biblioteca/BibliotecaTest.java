package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Book[] books;
    private String sampleOutput;

//    @Rule
//    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        books = new Book[] {
                new Book("Harry Potter and the Philosopher's Stone", "J.K.Rowling", 1997, false),
                new Book("A Town Like Alice", "Nevil Shute", 1950, false),
                new Book("The Alchemist", "Paulo Coelho", 1988, false),
                new Book("The Kite Runner", "Khaled Hosseini", 2003, false),
        };
        sampleOutput = "Harry Potter and the Philosopher's Stone | J.K.Rowling | 1997";
    }


    @Test
    public void testWelcomeMessage() {
        assertEquals(biblioteca.getWelcomeMessage(), "Welcome to Biblioteca!");
    }


    @Test
    public void testOpenMenu()  {
        biblioteca.open();
//        assertEquals("Welcome to Biblioteca!\n" + "L: List books\n", systemOutRule.getLog());
    }

    @Test
    public void testCheckOutBook() {
        biblioteca.checkOut("A Town Like Alice");
        String availableBookList = biblioteca.listBooks();
            assertFalse(availableBookList.contains("A Town Like ALice"));
    }







}
