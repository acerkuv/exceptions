package org.example;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("The length of the login must have 6 symbols!");
    }
}
