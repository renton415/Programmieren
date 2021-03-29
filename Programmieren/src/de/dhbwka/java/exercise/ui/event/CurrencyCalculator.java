package de.dhbwka.java.exercise.ui.event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

import java.awt.BorderLayout;
@SuppressWarnings("serial")
public class CurrencyCalculator extends JFrame implements ActionListener{

    JButton eurToUs = new JButton("EUR -> USD");
    JButton usToEur = new JButton("USD -> EUR");
    JButton cancelBt = new JButton("Abbrechen");
    JTextField betrag = new JTextField("Bitte hier Betrag zum Umrechnen eigeben!");
    double EUR_TO_US = 1.14;
    double US_TO_EUR = 1/EUR_TO_US;


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == eurToUs) {
            double eurValue = Double.parseDouble(betrag.getText());
            betrag.setText(String.valueOf(convert(eurValue, EUR_TO_US)));
        } else if (e.getSource() == usToEur) {
            double usValue = Double.parseDouble(betrag.getText());
            betrag.setText(String.valueOf(convert(usValue, US_TO_EUR)));
        } else if (e.getSource() == cancelBt) {
            System.exit(0);
        }
    }

    public double convert (double in, double rate){
        return in * rate;
    }

    public CurrencyCalculator() {
        super("Währungsumrechner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        this.add(betrag, BorderLayout.NORTH);
        
        this.add(eurToUs, BorderLayout.WEST);
        this.add(usToEur, BorderLayout.CENTER);
        this.add(cancelBt, BorderLayout.EAST);
        eurToUs.addActionListener(this);
        usToEur.addActionListener(this);
        cancelBt.addActionListener(this);
        this.setSize(350, 90);
        this.setVisible(true);
    }
    public static void main (String[] args) {
        new CurrencyCalculator();
    }
}
