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
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        planFee = getPlanFee();
        overageMinutes = getOverageMinutes();
        double extraUsageCharge = 0.25;
        double taxPercentage = 15;

        overageFee = getOverageFee(planFee,extraUsageCharge);

        calculateTotalBill(planFee,overageMinutes,extraUsageCharge, taxPercentage);
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

    static double getTax(double planFee,double taxPercentage){
        double tax = overageFee *  (taxPercentage);
        return overageFee;
    }

    static void calculateTotalBill(double planFee, int overageMinutes, double extraUsageCharge, double taxPercentage){

    }
}
