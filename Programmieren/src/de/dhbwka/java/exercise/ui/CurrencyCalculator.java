package de.dhbwka.java.exercise.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;
@SuppressWarnings("serial")
public class CurrencyCalculator extends JFrame{

    public CurrencyCalculator() {
        super("Währungsumrechner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        this.add(new JTextField("Bitte hier Betrag zum Umrechnen eigeben!"), BorderLayout.NORTH);
        JButton eurToUs = new JButton("EUR -> USD");
        JButton usToEur = new JButton("USD -> EUR");
        JButton cancelBt = new JButton("Abbrechen");
        this.add(eurToUs, BorderLayout.WEST);
        this.add(usToEur, BorderLayout.CENTER);
        this.add(cancelBt, BorderLayout.EAST);
        this.setSize(350, 90);
        this.setVisible(true);
    }
    public static void main (String[] args) {
        new CurrencyCalculator();
    }
}
