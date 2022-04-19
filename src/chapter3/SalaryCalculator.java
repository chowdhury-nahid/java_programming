package chapter3;


import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void main(String[] args) {
        int salary = 1000;
        int salesTarget = 10;
        int additionalBonus = 250;

        System.out.println("Enter the number of sales the employee did this week.");
        Scanner scanner = new Scanner(System.in);
        int salesMade = scanner.nextInt();
        scanner.close();

        if(salesMade>salesTarget){
            salary += additionalBonus;
        }

        System.out.println("The salary for this week is $"+ salary);
    }
}
