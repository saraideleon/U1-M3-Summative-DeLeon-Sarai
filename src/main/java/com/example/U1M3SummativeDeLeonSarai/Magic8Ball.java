package com.example.U1M3SummativeDeLeonSarai;

public class Magic8Ball {
    //POJO which maps with JSON
    private String question;
    private String answer;

    //getters and setters
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

    //empty constructor
    public Magic8Ball(){
    }
    //constructor with parameters
    public Magic8Ball(String question, String answer){
        //this.question = question;
        this.answer = answer;
        this.question = question;
    }
    public Magic8Ball(String answer){
        this.answer = answer;
    }
}