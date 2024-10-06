package org.example;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("All passwords must be equals!");

    }
}
