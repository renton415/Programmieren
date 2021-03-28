package de.dhbwka.java.exercise.ui.paint;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Election extends JComponent{

    private final int COLUMN_WIDTH = 50;
    private final int COLUMN_DIST = 5;

    private void drawColumn() {

    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(COLUMN_DIST, 100, COLUMN_WIDTH, 150);

        g.setColor(Color.red);
        g.fillRect(COLUMN_WIDTH + 2* COLUMN_DIST, 100, COLUMN_WIDTH, 150);

        
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Bundestagswahl 2013");
        f.add(new Election());

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);;
        f.setVisible(true);
    }
}
