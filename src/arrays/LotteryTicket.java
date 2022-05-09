package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Nahid Chowdhury
 * Date: 5/9/2022
 * Time: 10:46 PM
 */

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 99;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket,randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static void printTicket(int[] ticket){
        for(int i=0; i<LENGTH;i++){
            System.out.println(ticket[i]+"  ");
        }
    }

    public static boolean search(int[] array,int numberToSearchFor){

        //enhanced loop
        for (int value: array){
            if(value == numberToSearchFor) return true;
        }
        return false;
    }

}
