package com.example.homeworkworkingwithexceptions;

public class LoopChecker implements Checker {
    static final String VAlID_CHARACTERS = "0123456789_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        for (int i = 0; i < s.length(); i++) {
            if (!VAlID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                if (login) {
                    throw new WrongLoginException("The login must contain only Latin alphabet characters, numbers or underscores");
                }else {
                    throw new WrongPasswordException("The password must contain only Latin alphabet characters, numbers or underscores");
                }

            }
        }
    }
}
