package com.twu.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Biblioteca self = new Biblioteca();

        System.out.println(self.welcomeMessage());
        System.out.println(self.ListBooks());
    }

    public String welcomeMessage() {
        return "Welcome to Biblioteca!";
    }

    public String ListBooks() {
        return "Harry Potter, Lord of the Flies, Little Women, BFG";
    }
}
