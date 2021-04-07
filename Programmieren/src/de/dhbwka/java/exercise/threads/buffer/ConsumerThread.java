package de.dhbwka.java.exercise.threads.buffer;

public class ConsumerThread extends Thread {
    MyBuffer buffer; 
 
    public ConsumerThread(MyBuffer b) { 
        this.buffer = b; 
    } 
    public void run() {
        for (int i = 0; i <= 6; i++){
            this.buffer.get();
        }
    }
}
