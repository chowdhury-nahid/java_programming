package coin_toss_game;

import java.util.Random;

/**
 * Created by Nahid Chowdhury
 * Date: 5/24/2022
 * Time: 6:17 PM
 */

public class Coin {

    private String side;
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){

        if(new Random().nextBoolean()){
            setSide("Heads");
        }
        else setSide("Tails");

        return getSide();
    }
}
