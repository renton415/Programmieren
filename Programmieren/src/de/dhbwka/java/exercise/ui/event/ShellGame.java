package de.dhbwka.java.exercise.ui.event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;

@SuppressWarnings("serial")
public class ShellGame extends JFrame implements ActionListener {

    int rand;
    int trys = 0;
    String resultFile = "results.txt";

    JPanel p1 = new JPanel(); 
    JPanel p2 = new JPanel(); 
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();

    JLabel playerName = new JLabel("Spielername");

    JTextField nameField = new JTextField("Name", 20);
    JTextField resultField = new JTextField("", 40);
    
    JButton shell1Btn = new JButton("Huetchen 1");
    JButton shell2Btn = new JButton("Huetchen 2");
    JButton shell3Btn = new JButton("Huetchen 3");
    JButton statBtn = new JButton("Statistik");
    JButton exitBtn = new JButton("Exit");
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == shell1Btn) {
            initNewGame();
            evaluatGuess(1);
        } else if (e.getSource() == shell2Btn) {
            initNewGame();
            evaluatGuess(2);
        } else if (e.getSource() == shell3Btn) {
            initNewGame();
            evaluatGuess(3);
        } else if (e.getSource() == statBtn) {

        } else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }

    public void initNewGame() {
        trys++;
        rand = (int) (Math.random() *3 + 1);
        System.out.println(rand);
    }

    public void evaluatGuess(int in) {
        if (in == rand) {
            resultField.setText("Versuch "+trys+" Gewonnen: Die Kugel war unter Hut "+rand);
            trys = 0;
            write();
        } else {
            resultField.setText("Versuch "+trys+" Verloren: Die Kugel war unter Hut "+rand);
        }
    }
    public void write() {
        try { 
            FileWriter f = new FileWriter(resultFile, true);
            f.write(nameField.getText() + " " + trys + " Versuche\n"); 
            f.close(); 
        } catch (Exception e) { 
        }
    }

    ShellGame() {
        super("Huetchenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        shell1Btn.addActionListener(this);
        shell2Btn.addActionListener(this);
        shell3Btn.addActionListener(this);
        statBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        p1.add(playerName);
        p1.add(nameField);
        p2.add(shell1Btn);
        p2.add(shell2Btn);
        p2.add(shell3Btn);
        p3.add(statBtn);
        p3.add(exitBtn);
        p4.add(resultField);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);

        this.setSize(500, 300);
        this.setVisible(true);
    }
    public static void main (String[] args) {
        new ShellGame();
    }
}
