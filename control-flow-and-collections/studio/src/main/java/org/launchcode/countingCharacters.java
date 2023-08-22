package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main (String[] args) {

        Scanner input;
        String stringVal;
        System.out.println("Enter the String: ");
        input = new Scanner(System.in);
        stringVal = input.nextLine();
        input.close();

       /* String stringVal="If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of " +
                "the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";*/
        char[] charactersInString = stringVal.toCharArray();

        HashMap<Character, Integer> charValues = new HashMap<>();
          for (int i = 0; i < charactersInString.length; i++) {
              int counter= 0;
              if (i==0){
                  charValues.put(charactersInString[i], 1);
              }

            for (Map.Entry<Character, Integer> loopValue : charValues.entrySet()) {


                  if ((charactersInString[i])==(loopValue.getKey())) {
                      charValues.put(loopValue.getKey(), loopValue.getValue()+1);
                       counter= 1;
                  }

               //   System.out.println(charactersInString[i]);
            }
            if (counter==0)
              {
                  charValues.put(charactersInString[i],1);
              }


        }
       for (Map.Entry<Character, Integer> loopValue : charValues.entrySet()) {
          System.out.println(loopValue.getKey() + " :" + loopValue.getValue() );
       }
    }
}
//Store and/or update the count for a given character using an appropriate data structure.