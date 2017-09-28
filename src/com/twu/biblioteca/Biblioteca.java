package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Biblioteca self = new Biblioteca();

        self.open();
        self.run();

    }

    private String welcomeMessage = "Welcome to Biblioteca!";
    private String[] validInputs = new String[] {"L", "C", "Q"};
    private Command[] commands = new Command[] {
            new ListCommand("L",
                    "List available books"),
            new CheckOut("C",
                    "Check out a book")
    };



    private Book[] books = new Book[] {
                new Book(
                        "Harry Potter and the Philosopher's Stone",
                        "J.K.Rowling",
                        1997, false),
            new Book("A Town Like Alice", "Nevil Shute", 1950, false),
            new Book("The Alchemist", "Paulo Coelho", 1988, false),
            new Book("The Kite Runner", "Khaled Hosseini", 2003, false),

    };

//    public String getMenu(){
//        return menu;
//    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public Book[] getBooks() {
        return books;
    }

    public Command[] getCommands() {
        return commands;
    }

    public String formatCommands() {
        String result = "";
        for (Command command : getCommands()) {
            result += command.toString() + "\n";
        }
        return result;
    }

    public void open() {
        System.out.println(getWelcomeMessage() + "\n\n" + formatCommands());
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        String command = scan.next().substring(0, 1);
        while (!Objects.equals(command, "Q")) {
            respondToInput(command);
            command = scan.next().substring(0, 1);
        }
    }

    private void respondToInput(String command) {
        if (isValidCommand(command)) {
            executeCommand(command);
        } else {
            System.out.println("Select a valid option!");
        }
    }

    private void executeCommand(String command) {
        for (Command element : getCommands()) {
            if (Objects.equals(command, element.getSymbol())) {
                element.run(getBooks());
            }
        }
    }

    private boolean isValidCommand(String command) {
        return Arrays.asList(validInputs).contains(command);
    }

}

