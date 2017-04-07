package com.harrypotter;

/**
 * Created by cmitchell on 4/7/17.
 */
public class Question {

    private Integer question_id;
    private String question;
    private String answer;
    private String answer1;
    private String answer2;
    private String answer3;


    public Question() {
    }

    public Question(Integer personId, String title, String firstName, String middleName, String lastName, String suffix) {
        this.question_id = question_id;
        this.question = question;
        this.answer = answer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;

    }

    public Integer getQuestion_id(int question_id) {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }
    @Override
    public String toString() {
        return "question{" +
                "question_id=" + question_id +
                ", question='" + question + '\'' +
                ", answer='" + answer+ '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                '}';
    }

}



