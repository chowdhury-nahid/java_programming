package coin_toss_game;

/**
 * Created by Nahid Chowdhury
 * Date: 5/24/2022
 * Time: 9:44 PM
 */

public class Player {

    private String name;
    private String guess;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }
}
