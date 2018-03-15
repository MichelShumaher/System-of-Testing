package TestingSystem.Modelu;

import static TestingSystem.Configuration.COUNTANSWERS;
import static TestingSystem.Configuration.COUNTQUESTIONS;
import static TestingSystem.Configuration.COUNTANSWERS;
import static TestingSystem.Configuration.COUNTQUESTIONS;

public class Data {


    public static int score = 0;

    private String[] questions = new String[COUNTQUESTIONS];
    private String[] answers = new String[COUNTANSWERS];
    private int[] rightAnswers = new int[COUNTQUESTIONS];


    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int[] getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(int[] rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
