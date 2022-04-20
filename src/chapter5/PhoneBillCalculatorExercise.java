package chapter5;

import java.nio.channels.SeekableByteChannel;
import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 4/17/2022
 * Time: 2:38 AM
 */

public class PhoneBillCalculatorExercise {

    static double planFee;
    static int overageMinutes;
    static double overageFee;
    static double tax;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double extraUsageCharge = 0.25;
        double taxPercentage = 15;

        planFee = getPlanFee();
        overageMinutes = getOverageMinutes();

        overageFee = getOverageFee(overageMinutes,extraUsageCharge);
        tax = getTax(planFee,overageFee,taxPercentage);
        calculateTotalBill(planFee,overageFee,tax);
        scanner.close();
    }

    static double getPlanFee(){
        System.out.println("Please Enter the plan fee:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    static int getOverageMinutes(){
        System.out.println("The overage minute:");
        int overageMinute = scanner.nextInt();
        return overageMinute;
    }

    static double getOverageFee(double planFee,double extraUsageCharge){
        double overageFee = planFee *  extraUsageCharge;
        return overageFee;
    }

    static double getTax(double planFee,double overageFee, double taxPercentage){
        double tax = (planFee+overageFee)*  (taxPercentage/100);
        return tax;
    }

    static void calculateTotalBill(double planFee, double overageFee, double tax){

        double total = planFee + overageFee + tax;
        System.out.println("Phone Bill:");
        System.out.printf("Plan Fee: $%.2f %n",planFee);
        System.out.printf("Overage Fee: $%.2f%n",overageFee);
        System.out.printf("Tax: $%.2f%n",tax);
        System.out.printf("Total: $%.2f%n", total);
    }
}
