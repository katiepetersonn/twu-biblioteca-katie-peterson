package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals(biblioteca.welcomeMessage(), "Welcome to Biblioteca!");
    }

    @Test
    public void testListBooks() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals(biblioteca.ListBooks(), "Book one, book two, book three");
    }


}
