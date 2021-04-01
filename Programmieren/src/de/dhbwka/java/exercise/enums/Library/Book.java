package de.dhbwka.java.exercise.enums.Library;

public class Book {
    
    public enum Attributes { 
 
        TITLE("Title"), 
        AUTHOR("Author"), 
        YEAR("Year"), 
        PUBLISHER("Publisher"); 
      
        private String name; 
      
        private Attributes( String name ) { 
           this.name = name; 
        } 
      
        public String getName() { 
           return this.name; 
        } 
      
    }

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
        public String getTitle() { 
    return title; 
    } 
 
    public void setTitle(String title) { 
         this.title = title; 
    } 
 
    public String getAuthor() { 
         return author; 
    }
 
    public void setAuthor(String author) { 
        this.author = author; 
    } 
 
    public int getYear() { 
        return year; 
    } 
 
    public void setYear(int year) { 
        this.year = year; 
    } 
 
    public String getPublisher() { 
        return publisher; 
    } 
 
    public void setPublisher(String publisher) { 
        this.publisher = publisher; 
    } 
}
