package de.dhbwka.java.exercise.threads.buffer;

import java.util.LinkedList;

public class MyBuffer {

    private final static int MAXSIZE = 3;

    LinkedList<Integer> elements = new LinkedList<>();
    // buffer Variables 
    //private int value;
 
    // the producer routine 
    public synchronized void put(int v) { 
        if (!(this.elements.size() <= MAXSIZE)) { 
            System.out.println("Puffer voll - warten!");
            try {
                this.wait(); 
            } catch (InterruptedException e) { 
            } 
        } 
        this.elements.add(v);
        
        // notify waiting consumer 
        this.notify(); 
        System.out.println("Put: " + v);
        System.out.println("Fill level after put: " + elements.size());
        
    }
     // the consumer routine 
     public synchronized int get() { 
        if (this.elements.size() == 0) { 
            // consumer must wait 
            // until buffer is full 
            try { 
                System.out.println("Puffer leer - warten!");
                this.wait(); 
            } catch (InterruptedException e) { 
            } 
        } 
        // buffer is full, empty it! 
        //v = this.value;
        int v = this.elements.remove(0);
        System.out.println("Get: " + v);
        System.out.println("Fill level after get: " + elements.size());
        this.notify();
        return v; 
    }
}
