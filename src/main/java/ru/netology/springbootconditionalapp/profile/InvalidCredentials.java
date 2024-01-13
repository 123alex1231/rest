package ru.netology.springbootconditionalapp.profile;
public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}