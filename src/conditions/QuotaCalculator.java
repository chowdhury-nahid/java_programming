package conditions;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String[] args) {

        int targetSales = 10;

        System.out.println("Enter the number of sales made by the sales person.");
        Scanner scanner = new Scanner(System.in);
        int numberOfSalesMade = scanner.nextInt();
        scanner.close();

        if(numberOfSalesMade>=targetSales){
            System.out.println("Congratulations!!!");
        }
        else {
            System.out.println("You were short by " + (targetSales-numberOfSalesMade)+ " sales");
        }

    }
}
