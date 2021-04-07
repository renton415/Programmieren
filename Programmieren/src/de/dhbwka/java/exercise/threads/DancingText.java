package de.dhbwka.java.exercise.threads;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color; 
import java.awt.Font; 
import javax.swing.JComponent; 

@SuppressWarnings("serial")
public class DancingText extends JComponent implements Runnable{

    //Thread runner;
    //JTextField dancingTextField = new JTextField();

    private final static int XBASE = 30; 
    private final static int XSTEP = 36; 
    private final static int YBASE = 150; 
    private final static Random RANDOM = new Random(); 
  
    private String text; 
    private final long delay; 
  
    private int colR = 0; // Color-Channel: red 
    private int colG = 90; // Color-Channel: green 
    private int colB = 180; // Color-Channel: blue 
    private int yOffset = 0;

    public DancingText(String text, long delay) {
        this.text = text; 
        this.delay = delay;
        new Thread(this).start();
    }
    
    public void run () {
        while(true) {
            this.repaint();
            try {
                Thread.sleep(this.delay);
            } catch (InterruptedException ex) {
                System.err.println( "Interrupted!" );
            }
        }
    }

    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Helvetica", Font.BOLD, 40)); 
        //g.drawString("D", 40, 75);
        for ( int i = 0; i < this.text.length(); i++ ) {
            char c = this.text.charAt( i ); 
 
            this.colR = (this.colR + 4 + DancingText.RANDOM.nextInt( 4 )) % 256; 
            this.colG = (this.colG + 4 + DancingText.RANDOM.nextInt( 4 )) % 256; 
            this.colB = (this.colB + 4 + DancingText.RANDOM.nextInt( 4 )) % 256; 
    
            this.yOffset = DancingText.RANDOM.nextInt( 30 ); 
    
            g.setColor( new Color( this.colR, this.colG, this.colB ) ); 
            g.drawString( "" + c, DancingText.XBASE + i * DancingText.XSTEP, 
                  DancingText.YBASE/* - this.yOffset */);
        }
    }

    public static void main (String[] args){
        JFrame f = new JFrame( "Dancing Text" );
        f.add(new DancingText( "Dancing Text :-)", 200));
        f.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        f.setSize(640, 280);
        f.setVisible(true);
    }
}
