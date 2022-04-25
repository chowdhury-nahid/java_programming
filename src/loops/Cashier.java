package loops;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 4/14/2022
 * Time: 3:30 AM
 */
/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double cost = 0;

        System.out.println("Enter the number of the items: ");
        int noOfItems = scanner.nextInt();

        for(int i=0; i<noOfItems; i++){

            System.out.println("Please enter the price of item #"+(i+1));
            double price = scanner.nextDouble();

            cost = cost + price;

        }
        scanner.close();
        System.out.println("the total cost of the items is: "+cost);
    }
}
