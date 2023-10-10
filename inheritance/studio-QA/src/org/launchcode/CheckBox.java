package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox  extends Question {
    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    public CheckBox(int pointValue, String text, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(pointValue, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
        setPointValue(this.correctAnswers.size());
    }

    @Override
    public void displayAnswers() {
        for (String s : possibleAnswers) {
            System.out.println(s);
        }
    }


    public int checkAnswer(ArrayList<Integer> check) {

        int answersCorrect = 0;
        for (Integer integer : check) {
            if (correctAnswers.contains(integer)) {
                answersCorrect++;
            }
        }
      return answersCorrect;

    }
    @Override
    public int getAnswers(){
        ArrayList<Integer> usersAnswers=new ArrayList<>();
        System.out.println("For this question there are multiple answers.Enter y to continue or n to stop");
        Scanner userContinue=new Scanner(System.in);
        String goingToContinue=userContinue.nextLine();
        while (goingToContinue.indexOf('y')>=0){
            System.out.println("What will your answer be?Enter your options.Continue answering with an number option from 1 to 4");
            Scanner userAnswer=new Scanner(System.in);
            String answer=userAnswer.nextLine();
            int option =Integer.parseInt(answer);
            usersAnswers.add(option);
            System.out.println("For this question there is multiple answers.Enter y to continue or n to stop");
            goingToContinue=userContinue.nextLine();
        }
        return checkAnswer(usersAnswers);
    }
}

