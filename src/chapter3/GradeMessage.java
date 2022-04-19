package chapter3;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String[] args) {

        System.out.println("Enter your Grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade){
            case "A":
                message = "Congrats!";
                break;
            case "B":
                message = "Well done";
                break;
            case "C":
                message = "Well you got C";
                break;
            case "D":
                message = "Try harder!";
                break;
            case "F":
                message = "Seriously? !!!";
                break;
            default:
                message = "Invalid Grade";
                break;
        }

        System.out.println(message);
    }

}
