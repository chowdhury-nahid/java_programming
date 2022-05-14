package arrays;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 5/14/2022
 * Time: 11:47 AM
 */

public class DayOfTheWeek {

    private static final String[] DAYS_OF_THE_WEEK = {"Monday","Tuseday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num = getNumber();
        scanner.close();
        System.out.println("The day is: "+DAYS_OF_THE_WEEK[num-1] );
    }

    public static int getNumber(){
        System.out.println("Please enter a number ");
        return scanner.nextInt();
    }
}
