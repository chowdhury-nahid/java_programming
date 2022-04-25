package methods.variable_scope;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 4/17/2022
 * Time: 1:15 AM
 */
/*
 * VARIABLE SCOPE
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    static int reqSalary = 25000;
    static int reqScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double salary = getSalary();
        int score =  getScore();
        scanner.close();

        boolean qualification =  isQualified(salary,score);
        notifyUser(qualification);
    }

    static double getSalary(){
        System.out.println("Please enter your current salary:");
        double salary= scanner.nextDouble();
        return salary;
    }
    static int getScore(){
        System.out.println("Please enter your current credit score:");
        int score= scanner.nextInt();
        return score;
    }

    static boolean isQualified(double salary, int score){
        if(salary>=reqSalary && score>=reqScore){
            return true;
        }
        else {
            return false;
        }
    }

    static void notifyUser(boolean approved){
        if(approved){
            System.out.println("You are approved");
        }
        else {
            System.out.println("Sorry you do not meet the criteria");
        }
    }
}
