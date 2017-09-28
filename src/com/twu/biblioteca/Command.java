package com.twu.biblioteca;

public class Command {

    private String symbol;
    private String description;

    public Command(String symbol, String description) {
        this.symbol = symbol;
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return getSymbol() + ": " + getDescription();
    }

    public void run(Book[] books) { }

}