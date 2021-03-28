package de.dhbwka.java.exercise.ui.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class BMICalculator extends JFrame {

    ButtonGroup gender = new ButtonGroup();
    JRadioButton male = new JRadioButton("maennlich");
    JRadioButton female = new JRadioButton("weiblich");
    JPanel bottom = new JPanel();
    JLabel bmiLabel = new JLabel("BMI:");
    JTextField bmiResult = new JTextField("");
    JTextField classification = new JTextField("");
    JButton berechnen = new JButton("berechne");

    public double calculateBmi(double weight, double height){
        if (weight > 0 && height > 0) {
            return (weight/height*height);
        } else {
            return 0.0;
        }
    }

    public String getClassification (double bmi, boolean gender) {
        if (bmi > 0.0) {
            if (gender) {
                if (bmi < 20.0){
                    return "Untergewicht";
                } else{
                    if (bmi <= 25.0) {
                        return "Normalgewicht";
                    } else {
                        if (bmi <= 30.0) {
                            return "Uebergewicht";
                        } else {
                            if (bmi <= 40.0) {
                                return "Adipositas";
                            } else {
                                return "massive Adipositas";
                            }
                        }
                    }
                }
            } else {
                if (bmi < 19.0){
                    return "Untergewicht";
                } else{
                    if (bmi <= 24.0) {
                        return "Normalgewicht";
                    } else {
                        if (bmi <= 30.0) {
                            return "Uebergewicht";
                        } else {
                            if (bmi <= 40.0) {
                                return "Adipositas";
                            } else {
                                return "massive Adipositas";
                            }
                        }
                    }
                }
            }
        } else {
            return "Ungueltiger BMI";
        }
    }

    public BMICalculator() {
        super("BMI Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(2,2,2,2));

        top.add(new JLabel("Gewicht in kg:"));
        top.add(new JTextField(""));

        top.add(new JLabel("Groesse in m:"));
        top.add(new JTextField(""));

        this.add(top);

        
        gender.add(male);
        gender.add(female);
        male.setSelected(true);
        this.add(top, BorderLayout.NORTH);

        JPanel mid = new JPanel();
        mid.add(male);
        mid.add(female);

        mid.add(berechnen);

        this.add(mid, BorderLayout.CENTER);
        
        bottom.add(bmiLabel);
        bottom.add(bmiResult);
        bottom.add(classification);

        this.add(bottom, BorderLayout.SOUTH);

        //this.setSize(350, 90);
        this.pack();
        this.setVisible(true);
    }
    public static void main (String[] args) {
        new BMICalculator();
    }
}
