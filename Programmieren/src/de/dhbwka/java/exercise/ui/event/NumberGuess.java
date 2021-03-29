package de.dhbwka.java.exercise.ui.event;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.awt.*;

public class NumberGuess extends JFrame implements ActionListener {

    int limit = 1000;
    int rand;
    int trys = 0;
    String resultFile = "results.txt";

    JPanel p1 = new JPanel(); 
    JPanel p2 = new JPanel(); 
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();

    JLabel playerName = new JLabel("Spielername");
    JLabel command = new JLabel("Zahl zwischen 1 und "+limit+" eingeben");

    JTextField name = new JTextField("Name", 20);
    JTextField numberGuess = new JTextField("", 10);

    JButton newGameBtn = new JButton("Neues Spiel");
    JButton okBtn = new JButton("Ok");
    JButton bestBtn = new JButton("Bester");
    JButton exitBtn = new JButton("Exit");

    JTextField resultField = new JTextField("Resultat",40);

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == newGameBtn) {
            initNewGame();
            resultField.setText("Neues Spiel!");
        }else if (e.getSource() == okBtn) {
            trys++;
            evaluatGuess(Integer.parseInt(numberGuess.getText()));
        }else if (e.getSource() == bestBtn) {
            
        }else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }

    public void evaluatGuess(int in) {
        if (in > rand) {
            resultField.setText("Versuch Nr. "+trys+": "+in+" ist zu zu hoch!");
        } else if (in < rand) {
            resultField.setText("Versuch Nr. "+trys+": "+in+" ist zu niedrig!");
        } else {
            write();
            resultField.setText("Versuch Nr. "+trys+": "+in+" ist richtig! Neues Spiel!");
            initNewGame();
        }
    }

    public void initNewGame() {
        trys = 0;
        rand = (int) (Math.random() *1000);
    }

    public void write(){
        try { 
            FileWriter f = new FileWriter(resultFile, true);
            f.write(name.getText() + " " + trys + " Versuche\n"); 
            f.close(); 
        } catch (Exception e) { 
        } 
    }

    public void read(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(resultFile));
            
        } catch (Exception e){
            
        }
    }
    NumberGuess(){
        super("Ratespiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        initNewGame();

        newGameBtn.addActionListener(this);
        okBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        p1.add(playerName);
        p1.add(name);
        p2.add(command);
        p2.add(numberGuess);
        p3.add(newGameBtn);
        p3.add(okBtn);
        p3.add(bestBtn);
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
        new NumberGuess();
    }
    
}
