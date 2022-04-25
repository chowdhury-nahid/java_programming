package fundamentals;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Enter the number of cups of coffee you drink: ");
        int cupsOfCoffee = scanner.nextInt();

        System.out.println("Enter an adjective describing the season: ");
        scanner.nextLine();
        String adj = scanner.nextLine();
        scanner.close();

        System.out.println("On a "+adj+" "+season+ " day, I drink a minimum of "+cupsOfCoffee+" cups of coffee.");

    }
}
