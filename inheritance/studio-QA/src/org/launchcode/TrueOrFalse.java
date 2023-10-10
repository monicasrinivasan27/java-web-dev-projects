package org.launchcode;

import java.util.Scanner;

public class TrueOrFalse extends Question{

    private boolean correctAnswer;
    public TrueOrFalse(int pointValue, String text,boolean correctAnswer) {
        super(pointValue, text);
        setPointValue(1);
        this.correctAnswer=correctAnswer;
    }



    public boolean isCorrectAnswer(boolean possibleAnswer) {
        return (possibleAnswer==correctAnswer);
    }
    @Override
    public void displayAnswers() {
        System.out.println("True or False");
    }
    @Override
    public int getAnswers(){
        Scanner answer = new Scanner(System.in);
        String userAnswer=answer.nextLine();
        int returnValue =0;
        if (userAnswer.indexOf('t')>=0){
            if (isCorrectAnswer(true)){
                return 1;
            }
            else {return 0;}
        }
        else {
            if (isCorrectAnswer(false)){
                return 1;
            }
            else {return 0;}
        }
        }

    }