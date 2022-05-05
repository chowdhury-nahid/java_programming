package objects.excercise;

/**
 * Created by Nahid Chowdhury
 * Date: 5/1/2022
 * Time: 12:20 PM
 */

public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill(0001);
        phoneBill.setMinutesUsed(1000);
        phoneBill.printTheBill();
    }
}
