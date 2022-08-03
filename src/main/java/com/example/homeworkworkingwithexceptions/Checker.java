package com.example.homeworkworkingwithexceptions;

public interface Checker {
    default void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {

    }

}
