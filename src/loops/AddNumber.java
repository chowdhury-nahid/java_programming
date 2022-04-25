package loops;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumber {

    public static void main(String[] args) {

        boolean again;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Please enter the first number.");
            int firstNumber = scanner.nextInt();

            System.out.println("Please enter the second number.");
            int secondNumber = scanner.nextInt();

            int total = firstNumber+secondNumber;
            System.out.println("The addition is "+total);

            System.out.println("Do you want to do it again?");
            again = scanner.nextBoolean();
        }while (again);

        scanner.close();
    }
}
