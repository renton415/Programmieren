package de.dhbwka.java.exercise.threads.buffer;

public class ProducerThread extends Thread {
    MyBuffer buf; 
 
    public ProducerThread(MyBuffer b) { 
        this.buf = b; 
    } 
    public void run() { 
        for (int i = 0; i <= 6; i++){
            this.buf.put(i);
        } 
    }
}
