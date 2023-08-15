package org.launchcode;
import java.util.Scanner;

public class AliceAdventures {
    public static void main(String[] args) {
        String stringVar="Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
    System.out.println(stringVar);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the search for within this string.");
        String searchStr = input.nextLine();
        System.out.println("Enter the string to be modified.");
        String newStrMod=input.nextLine();

        if (stringVar.toUpperCase().contains(searchStr.toUpperCase())) {
            int index = stringVar.toUpperCase().indexOf(searchStr.toUpperCase());
            int length = searchStr.length();
            System.out.println("The word " + "'"+searchStr+"'"+ " was found in the string.");
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedStr = stringVar.replace(searchStr, newStrMod);
            System.out.println(modifiedStr);
        } else {
            System.out.println("The word " + "'"+searchStr+"'"+ " was NOT found in the string.");
        }
    }
}
