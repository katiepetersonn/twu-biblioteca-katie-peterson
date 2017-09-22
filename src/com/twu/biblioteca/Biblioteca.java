package com.twu.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Biblioteca self = new Biblioteca();
        self.welcomeMessage();
        System.out.println(self.welcomeMessage());
        System.out.println(self.ListBooks());
    }

    public String welcomeMessage() {
        return "Welcome to Biblioteca!";
    }

    public String ListBooks() {
        return "Book one, book two, book three";
    }
}
