package de.dhbwka.java.exercise.threads;

import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class TrafficLight extends JComponent implements Runnable {

    private final static long DELAY = 500;

    //List<LightPhase> list = new LinkedList<LightPhase>();
    private LightPhase currentPhase;

    public TrafficLight() {
        LightPhase redYellow = new LightPhase("redYellow", true, true, false, 1);
        LightPhase red = new LightPhase("red", true, false, false, 10, redYellow);
        
        LightPhase yellow = new LightPhase("yellow", false, true, false, 2, red);
        LightPhase green = new LightPhase("green", false, false, true, 10, yellow);
        redYellow.setNext(green);
        this.currentPhase = green;
        new Thread(this).start();
    }

    public void run () {
        while(true) {
            this.repaint();
            try {
                Thread.sleep(this.currentPhase.getDuration() * TrafficLight.DELAY);
                this.currentPhase = this.currentPhase.getNext();
            } catch (InterruptedException ex) {
                System.err.println( "Interrupted!" );
            }
        }
    }

    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(30, 30, 70, 180);
        g.setColor(Color.WHITE);
        g.fillOval(40, 40, 50, 50);
        if (this.currentPhase.isRed()) {
            g.setColor(Color.RED);
            g.fillOval(41,41,48,48);
            g.setColor(Color.WHITE);
        }
            
        g.fillOval(40, 95, 50, 50);
        if (this.currentPhase.isYellow()) {
            g.setColor(Color.YELLOW);
            g.fillOval(41,96,48,48);
            g.setColor(Color.WHITE);
        }
        g.fillOval(40, 150, 50, 50);
        if (this.currentPhase.isGreen()) {
            g.setColor(Color.GREEN);
            g.fillOval(41,151,48,48);
            g.setColor(Color.WHITE);
        }
    }

    public static void main (String[] args){
        JFrame f = new JFrame("Traffic Light");
        f.add(new TrafficLight());
        f.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        f.setSize(250, 280);
        f.setVisible(true);
    }
}
