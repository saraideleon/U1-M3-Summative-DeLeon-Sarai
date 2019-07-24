package com.example.U1M3SummativeDeLeonSarai;

public class QuoteOfTheDay {
    //POJO which maps with JSON
    private String quote;
    private String author;

    //getters and setters
    public String getQuote() {
        return quote;
    }
    public void setQuote(String quote) {
        this.quote = quote;
    }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    //empty constructor
    public QuoteOfTheDay(){
    }
    //constructor with parameters
    public QuoteOfTheDay(String quote, String author){
        this.quote = quote;
        this.author = author;
    }
}