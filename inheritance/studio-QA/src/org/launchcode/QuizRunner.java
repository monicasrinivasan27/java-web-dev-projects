package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main (String[] args){
        Quiz myQuiz= new Quiz(new ArrayList<>());
        ArrayList<String> possAns1=new ArrayList<>(Arrays.asList("Garfield","Sales","Tom","Marie"));
        ArrayList<Integer> corectAns1= new ArrayList<>(Arrays.asList(2,3));
        CheckBox newQuestion1= new CheckBox(2,"Who is the best cat ?",possAns1,corectAns1);
        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possAns2=new ArrayList<>(Arrays.asList("Doc","Title","Tom","Tim"));
        MultiplkeChoice newQuestion2= new MultiplkeChoice(1,"Who won the Halloween Costume Contenst ",1,possAns2);
        myQuiz.addQuestion(newQuestion2);
        TrueOrFalse newQuestion3= new TrueOrFalse(1,"Are all dogs best?",true);
        myQuiz.addQuestion(newQuestion3);
        myQuiz.runQuiz();
        myQuiz.gradeQuiz();
    }
}
