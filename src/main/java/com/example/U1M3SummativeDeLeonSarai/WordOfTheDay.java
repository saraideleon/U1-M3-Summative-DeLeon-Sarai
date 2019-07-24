package com.example.U1M3SummativeDeLeonSarai;

public class WordOfTheDay {
    private String word;
    private String definition;

    //getters and setters
    public String getWord() {
        return word;
    }
    public void setWord(String quote) {
        this.word = word;
    }
    public String getDefinition() { return definition; }
    public void setDefinition(String definition) { this.definition = definition; }

    //empty constructor
    public WordOfTheDay(){
    }
    //constructor with parameters
    public WordOfTheDay(String word, String definition){
        this.word = word;
        this.definition = definition;
    }
}



