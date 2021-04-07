package de.dhbwka.java.exercise.threads;

public class LightPhase {
    
    private String name; 
    private boolean red; 
    private boolean yellow; 
    private boolean green; 
    private int duration; 
    private LightPhase next;  // or: private int next;  Reference to next phase

    public LightPhase getNext() { 
        return this.next; 
    } 

    LightPhase (String name, boolean red, boolean yellow, boolean green, int duration, LightPhase next) {
        this.name = name;
        this.red = red;
        this.yellow = yellow;
        this.green = green;
        this.duration = duration;
        this.next = next;
    }
}
