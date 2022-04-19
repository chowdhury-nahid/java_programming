package chapter3;

import java.util.Scanner;

/*
 * Logical Operators:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {

        int requiredSalary = 30000;
        int requiredExperience = 2;

        System.out.println("What is your salary");
        Scanner scanner = new Scanner(System.in);
        double currentSalary = scanner.nextDouble();

        System.out.println("How many years is your experience");
        double experience = scanner.nextDouble();
        scanner.close();

        if(currentSalary>=30000 && experience>= requiredExperience){

                System.out.println("You are qualified for loan.");
        }
        else {
            System.out.println("You have to minimum earn $"+requiredSalary);
        }
    }
}
