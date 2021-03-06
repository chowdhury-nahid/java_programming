package objects.excercise;

import java.security.PublicKey;

/**
 * Created by Nahid Chowdhury
 * Date: 4/26/2022
 * Time: 1:20 AM
 */

public class PhoneBill {

    double extraUsageCharge = 0.25;
    double taxPercentage = 15;

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {
        id = 0;
        baseCost = 59.99;
        allottedMinutes = 200;
        minutesUsed = 200;
    }

    public PhoneBill(int id) {
        this.id = getId();
        baseCost = 59.99;
        allottedMinutes = 200;
        minutesUsed = 200;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(){
        if(minutesUsed<=allottedMinutes){
            return 0;
        }

        double overageRate = .25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageRate * overageMinutes;
    }

    public double calculateTax(){
        double taxRate = .15;
        return taxRate * (baseCost+calculateOverage());
    }

    public double calculateTotal(){
        return baseCost+calculateOverage()+calculateTax();
    }

    public void printTheBill(){
        System.out.println("ID: "+id);
        System.out.println("Base Rate: $"+baseCost );
        System.out.println("Overage Fee: $"+String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"+String.format("%.2f", calculateTax()));
        System.out.println("Total: $"+String.format("%.2f", calculateTotal()));
    }
}
