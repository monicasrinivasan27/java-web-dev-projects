package org.launchcode;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;
    private int total;
    public Quiz(ArrayList<Question> questions){
        this.questions=questions;
        this.score=0;
        this.total=0;
        for (Question value : questions) {
            this.total = this.total + value.getPointValue();
        }
    }
    public void addQuestion(Question newQuestion){{
    this.questions.add(newQuestion);
    this.total=this.total+newQuestion.getPointValue();
    }
    }
    public void runQuiz(){
        for (Question question:this.questions){
            question.displayQuestion();
            question.displayAnswers();
            int pts=question.getAnswers();
            updateScores(pts);
        }
    }
    public void updateScores(int x){this.score=this.score+x;}
    public void gradeQuiz(){
        System.out.println("Finished with the Quiz.Your Score is: "+score+"/"+total);
    }
}
