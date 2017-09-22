package com.twu.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Biblioteca self = new Biblioteca();
        self.welcomeMessage();

    }

    public String welcomeMessage() {
        String message = "Welcome to Biblioteca!";
        System.out.println(message);
        return message;
    }
}
