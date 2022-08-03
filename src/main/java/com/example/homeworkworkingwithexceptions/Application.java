package com.example.homeworkworkingwithexceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean result = Validator.validate("java_skyprogo", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result) {
            System.out.println("The data is correct");
        } else {
            System.out.println("The data is not correct");
        }


    }

}
