package com.example.homeworkworkingwithexceptions;

import java.util.Objects;

import static java.lang.Object.*;

public class Validator {
    private Validator(){

    }
    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword)  {
        try {

        check(login, password, confirmPassword);
        return true;
    }catch (WrongLoginException|WrongPasswordException e) {
            System.out.println();
            return false;
        }
        }

    private static void check(String login,
                              String password,
                              String comfirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login==null|| login.isEmpty()||login.length()>20){
            throw new WrongLoginException("The length of the login must be less than 20 characters");
        }
        if (password == null|| password.isEmpty()||password.length()>=20){
            throw new WrongPasswordException("The password must be less than 20 characters long");
        }
        if (!Objects.equals(password,comfirmPassword)){
            throw new WrongPasswordException("Passwords must match");
        }
        Checker checker = new RegexpChecker();
        checker.check(login,true);
        checker.check(password,false);
    }


}
