package inheritance;

/**
 * Created by Nahid Chowdhury
 * Date: 5/15/2022
 * Time: 4:31 PM
 */

public class InheritanceTester {

    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Nargis");

        System.out.println(mom.getName()+" is a "+ mom.getGender());

    }
}
