package coin_toss_game;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 5/24/2022
 * Time: 9:46 PM
 */

public class CoinTossGame {

    private Scanner scanner;

    public static void main(String[] args) {

        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        Player player1 = new Player(game.askPlayerName());
        player1.setGuess(game.askGuess());

        Player player2 = new Player(game.askPlayerName());
        if(player1.getGuess().equalsIgnoreCase(Coin.HEADS)){
            player2.setGuess(Coin.TAILS);
        }
        else player2.setGuess(Coin.HEADS);

        System.out.println("Flipping the coin...");
        Coin coin = new Coin();
        coin.flip();
        System.out.println("The coin landed on "+ coin.getSide());

        game.determineWinner(player1,player2,coin);
        game.scanner.close();
    }

    public String askPlayerName(){
        System.out.println("Please type your name: ");
        return scanner.next();
    }

    public String askGuess(){
        String ask = String.format("%s or %s? ",Coin.HEADS,Coin.TAILS);
        System.out.println(ask);
        scanner.nextLine();// extra call for scanner
        String guess = scanner.nextLine();

        while (!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)){

            System.out.println("Invalid guess! "+ ask);
            guess = scanner.nextLine();
        }
        return guess;
    }

    public void determineWinner(Player p1, Player p2, Coin c){

        String winner;
        if(c.getSide().equalsIgnoreCase(p1.getGuess())){
            winner = p1.getName();
        }else{
            winner = p2.getName();
        }

        System.out.println("The winner is " + winner);
    }
}
