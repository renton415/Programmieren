package de.dhbwka.java.exercise.collections;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{
    private int order; // Selects Attribute to compare 
 
    public BookComparator(int order) { 
        this.order = order; 
    } 
 
    public int compare(Book b1, Book b2) { 
        switch (order) { 
            case Book.TITLE:
                return b1.getTitle().compareTo(b2.getTitle()); 
            case Book.AUTHOR:
                return b1.getAuthor().compareTo(b2.getAuthor()); 
            case Book.YEAR:
                return b1.getYear()-b2.getYear(); 
            case Book.PUBLISHER:
                return b1.getPublisher().compareTo(b2.getPublisher()); 
        } 
        return 0; 
    } 
}
