package de.dhbwka.java.exercise.threads;

import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class TrafficLight extends JComponent implements Runnable {

    private final int DELAY = 500;

    public TrafficLight() {
        new Thread(this).start();
    }

    public void run () {
        while(true) {
            this.repaint();
            try {
                Thread.sleep(this.DELAY);
            } catch (InterruptedException ex) {
                System.err.println( "Interrupted!" );
            }
        }
    }

    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.fillOval(40, 30, 50, 50);
        g.setColor(Color.BLACK);
        g.fillRect(30, 30, 70, 160);
        g.setColor(Color.WHITE);
        g.fillOval(40, 40, 50, 50);
    }

    public static void main (String[] args){
        JFrame f = new JFrame("Traffic Light");
        f.add(new TrafficLight());
        f.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        f.setSize(640, 280);
        f.setVisible(true);
    }
}
