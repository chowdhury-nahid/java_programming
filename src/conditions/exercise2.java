package conditions;

import java.util.Scanner;

//Change for a Dollar game
public class exercise2 {
    public static void main(String[] args) {

        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();

        System.out.println("How many nickels would you like?");
        double nickels = scanner.nextDouble();

        System.out.println("How many dimes?");
        double dimes = scanner.nextDouble();

        System.out.println("How many quarters?");
        double quarters = scanner.nextDouble();

        scanner.close();

        double total =  (0.01*pennies)+(0.05*nickels)+(0.1*dimes)+(0.25*quarters);
        System.out.println(total);

        if(total==1){
            System.out.println("Congrats! you win the game");
        }
        else if (total<1){
            System.out.println("Ohh you went under "+(1-total)*100+" cents");
        }
        else{
            System.out.println("Wow you went over "+(total-1)*100+" cents");
        }
    }
}
