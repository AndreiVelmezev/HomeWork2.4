package com.example.homeworkworkingwithexceptions;

import static com.example.homeworkworkingwithexceptions.LoopChecker.VAlID_CHARACTERS;

public class RegexpChecker implements Checker {
    @Override
    public void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        if (!s.matches("^\\w{1,20}$")) {
            if (login) {
                throw new WrongLoginException("The login must contain only Latin alphabet characters, numbers or underscores");
            } else {
                throw new WrongPasswordException("The password must contain only Latin alphabet characters, numbers or underscores");
            }

        }

    }
}
