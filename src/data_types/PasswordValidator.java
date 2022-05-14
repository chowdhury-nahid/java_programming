package data_types;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 5/14/2022
 * Time: 2:28 PM
 */

public class PasswordValidator {

    private static Scanner scanner = new Scanner(System.in);
    private static String userName;
    private static String oldPassword;

    public static void validatePassword(String password, String username, String oldPassword){

        if(password.length()<8) printPasswordRules();
        else if(password == password.toLowerCase()) printPasswordRules();
        else if(password.matches("[a-zA-Z0-9 ]*")) printPasswordRules();
        else if(password.contains(username)) printPasswordRules();
        else if(password.matches(oldPassword)) printPasswordRules();
        else System.out.println("Valid password");

    }

    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Please enter the username: ");
        userName = scanner.next();

        System.out.println("Please enter the old password: ");
        oldPassword = scanner.next();

        System.out.println("Please enter a password: ");
        validatePassword(scanner.next(), userName, oldPassword);
        scanner.close();
    }
}
