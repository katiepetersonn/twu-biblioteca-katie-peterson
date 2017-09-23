package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Book[] books;
    private String sampleOutput;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        books = new Book[] {
                new Book("Harry Potter and the Philosopher's Stone", "J.K.Rowling", 1997),
                new Book("A Town Like Alice", "Nevil Shute", 1950),
                new Book("The Alchemist", "Paulo Coelho", 1988),
                new Book("The Kite Runner", "Khaled Hosseini", 2003),
        };
        sampleOutput = "Harry Potter and the Philosopher's Stone | J.K.Rowling | 1997";
    }

    @Test
    public void testWelcomeMessage() {
        assertEquals(biblioteca.welcomeMessage(), "Welcome to Biblioteca!");
    }

    @Test
    public void testListBooks()
    {
        assertTrue(biblioteca.listBooks().contains(sampleOutput));
    }


}
