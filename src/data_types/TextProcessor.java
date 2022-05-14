package data_types;

/**
 * Created by Nahid Chowdhury
 * Date: 5/14/2022
 * Time: 1:04 PM
 */

public class TextProcessor {

    public static void main(String[] args) {

        countWords("I know what you did last summer!");
        printBackwards("Hello World!");
        addSpaces("HelloWorld.It'sMeNahid");
    }

    public static void countWords(String text){

        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d number of words",numberOfWords);
        System.out.println(message);

        for (String word: words
             ) {
            System.out.println(word);
        }
    }

    public static void printBackwards(String text){
        for (int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);
        for(int i=0; i< modifiedText.length();i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
