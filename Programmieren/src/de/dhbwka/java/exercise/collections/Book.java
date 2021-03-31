package de.dhbwka.java.exercise.collections;

public class Book {
    String title, author, publisher;
    int year;

    Book (String title, String author, int year, String publisher){
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    public String toString(){
        return title+";"+author+";"+year+";"+publisher+"\n";
    }
    
}
