package com.example.U1M3SummativeDeLeonSarai;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebServiceController {
    private List<QuoteOfTheDay> quoteList;
    private List<WordOfTheDay> wordList;
    private List<Magic8Ball> magic8List;

    public WebServiceController() {
        quoteList = new ArrayList<>();
        wordList = new ArrayList<>();
        magic8List = new ArrayList<>();

        quoteList.add(new QuoteOfTheDay("Any fool can write code that a computer can understand. Good programmers write code that humans can understand.", "Martin Fowler"));
        quoteList.add(new QuoteOfTheDay("First, solve the problem. Then, write the code.", "John Johnson"));
        quoteList.add(new QuoteOfTheDay("Java is to JavaScript what car is to Carpet.",  "Chris Heilmann"));
        quoteList.add(new QuoteOfTheDay("Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.", "Dan Salomon"));
        quoteList.add(new QuoteOfTheDay("Perfection is achieved not when there is nothing more to add, but rather when there is nothing more to take away.", "Antoine de Saint-Exupery"));
        quoteList.add(new QuoteOfTheDay("Code is like humor. When you have to explain it, it’s bad.", "Cory House"));
        quoteList.add(new QuoteOfTheDay("Fix the cause, not the symptom.", "Steve Maguire"));
        quoteList.add(new QuoteOfTheDay("We build our computer (systems) the way we build our cities: over time, without a plan, on top of ruins.", "Ellen Ullman"));
        quoteList.add(new QuoteOfTheDay("What one programmer can do in one month, two programmers can do in two months.", "Fred Brooks"));
        quoteList.add(new QuoteOfTheDay("Rules of Optimization: Rule 1: Don't do it. Rule 2 (for experts only): Don't do it yet.", "Michael A. Jackson"));
        quoteList.add(new QuoteOfTheDay("One of the best programming skills you can have is knowing when to walk away for awhile.", "Oscar Godson"));
        quoteList.add(new QuoteOfTheDay("First, solve the problem. Then, write the code.", "John Johnson"));
        wordList.add(new WordOfTheDay("abstract", "A Java keyword used in a class definition to specify that a class is not to be instantiated, but rather inherited by other classes. An abstract class can have abstract methods that are not implemented in the abstract class, but in subclasses."));
        wordList.add(new WordOfTheDay("array", "A collection of data items, all of the same type, in which each item's position is uniquely designated by an integer."));
        wordList.add(new WordOfTheDay("class", "In the Java programming language, a type that defines the implementation of a particular kind of object. A class definition defines instance and class variables and methods, as well as specifying the interfaces the class implements and the immediate superclass of the class. If the superclass is not explicitly specified, the superclass will implicitly be Object."));
        wordList.add(new WordOfTheDay("constructor", "A pseudo-method that creates an object. In the Java programming language, constructors are instance methods with the same name as their class. Constructors are invoked using the new keyword."));
        wordList.add(new WordOfTheDay("inheritance", "The concept of classes automatically containing the variables and methods defined in their supertypes . See also superclass , subclass ."));
        wordList.add(new WordOfTheDay("method", "A function defined in a class. See also instance method , class method . Unless specified otherwise, a method is not static."));
        wordList.add(new WordOfTheDay("object", "The principal building blocks of object-oriented programs. Each object is a programming unit consisting of data and functionality"));
        wordList.add(new WordOfTheDay("property", "Characteristics of an object that users can set, such as the color of a window."));
        wordList.add(new WordOfTheDay("public", "A Java keyword used in a method or variable declaration. It signifies that the method or variable can be accessed by elements residing in other classes."));
        wordList.add(new WordOfTheDay("variable", "An item of data named by an identifier. Each variable has a type, such as int or Object, and a scope."));
        magic8List.add(new Magic8Ball("It is decidedly so"));
        magic8List.add(new Magic8Ball("Ask again later"));
        magic8List.add(new Magic8Ball("Outlook not so good"));
        magic8List.add(new Magic8Ball("Without a doubt"));
        magic8List.add(new Magic8Ball("Yes – definitely"));
        magic8List.add(new Magic8Ball("As I see it, yes"));
        magic8List.add(new Magic8Ball("Most Likely"));
        magic8List.add(new Magic8Ball("Better not tell you now"));

    }
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
        public QuoteOfTheDay getQuote(){
        int x = (int) (Math.random() * 12);
        return quoteList.get(x);
    }
    @RequestMapping(value = "/word", method = RequestMethod.GET)
        public WordOfTheDay getWord(){
        int w = (int) (Math.random()*11);
        return wordList.get(w);
    }
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
        public Magic8Ball ask8Ball(@RequestBody String question) {
        int a = (int) (Math.random()*7);
        this.magic8List.get(a).setQuestion(question);
        this.magic8List.get(a).getAnswer();
        return magic8List.get(a);
    }
}