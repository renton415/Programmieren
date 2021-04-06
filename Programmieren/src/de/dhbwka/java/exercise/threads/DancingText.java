package de.dhbwka.java.exercise.threads;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DancingText extends JFrame implements Runnable{

    Thread runner;
    JTextField dancingTextField = new JTextField();

    public DancingText() {
        super("Dancing Text");
        this.add(this.dancingTextField);
        this.runner = new Thread(this);
        this.runner.start();

    }
    public void run () {
        while(true) {
            try {

            } catch (InterruptedException ex) {

            }
        }
    }

    public static void main (String[] args){
        DancingText dt = new DancingText();
        dt.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        dt.setSize(400, 200);
        dt.setVisible(true);
    }
}
