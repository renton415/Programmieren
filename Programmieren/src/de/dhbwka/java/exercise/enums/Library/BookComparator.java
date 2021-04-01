package de.dhbwka.java.exercise.enums.Library;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{
    private Book.Attributes order; // Selects Attribute to compare 
 
    public BookComparator(Book.Attributes order) { 
        this.order = order; 
    } 
 
    public int compare(Book b1, Book b2) { 
        switch (order) { 
            case TITLE:
                return b1.getTitle().compareTo(b2.getTitle()); 
            case AUTHOR:
                return b1.getAuthor().compareTo(b2.getAuthor()); 
            case YEAR:
                return b1.getYear()-b2.getYear(); 
            case PUBLISHER:
                return b1.getPublisher().compareTo(b2.getPublisher()); 
        } 
        return 0; 
    } 
}
