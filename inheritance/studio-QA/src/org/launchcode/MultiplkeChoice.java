package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplkeChoice extends Question{
    private ArrayList <String> possibleAnswers;
    private  int correctAnswer;
    public MultiplkeChoice(int pointValue, String text, int correctAnswer, ArrayList<String> possibleAnswers) {
        super(pointValue, text);
        this.correctAnswer=correctAnswer;
        this.possibleAnswers=possibleAnswers;
        setPointValue(1);
    }

    @Override
    public void displayAnswers() {
        for (String possibleAnswer : possibleAnswers) {
            System.out.println(possibleAnswer);
        }

    }
    public boolean isCorrectAnswer(int possibleAnswer) {
        return (possibleAnswer==correctAnswer);
    }

    @Override
    public int getAnswers() {
        Scanner answer=new Scanner(System.in);
        System.out.println("What will be your answer?Enter the number of the option.(1 to 4)");
        String userAnswer=answer.nextLine();
        int result =Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)){return 1;}
        else {        return 0;}

    }
}
