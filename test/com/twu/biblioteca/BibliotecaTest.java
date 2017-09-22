package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @Before
    public void setup() {

    }


    @Test
    public void testWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals(biblioteca.welcomeMessage(), "Welcome to Biblioteca!");
    }

    @Test
    public void testListBooks() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals(biblioteca.ListBooks(), "Harry Potter, Lord of the Flies, Little Women, BFG");
    }

}
