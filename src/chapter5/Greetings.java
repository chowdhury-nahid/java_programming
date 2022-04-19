package chapter5;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 4/17/2022
 * Time: 1:02 AM
 */
/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings {

    public static void main(String[] args) {

        System.out.println("Please type your name...");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        greetUser(name);
        scanner.close();
    }
    static void greetUser(String name){
        System.out.println("Welcome, "+name);
    }
}
