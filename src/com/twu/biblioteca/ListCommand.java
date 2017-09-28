package com.twu.biblioteca;

public class ListCommand extends Command {

    public ListCommand(String symbol, String description) {
        super(symbol, description);
    }

    public void run(Book[] books) {
        String result = "";
        for (Book book: books) {
            if(!book.isOnLoan()) {
                result += book.toString() + "\n";
            }
        }
        System.out.println(result);
    }


}
