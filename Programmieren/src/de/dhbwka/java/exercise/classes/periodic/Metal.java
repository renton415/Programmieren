package de.dhbwka.java.exercise.classes.periodic;

public class Metal extends Element{
    boolean metalloid;
    double conductivity;

    Metal(String name, String symbol, int ordinal, String shell, int phase, boolean group, boolean metalloid, double conductivity) {
        super(name, symbol, ordinal, shell, phase, group);
        this.metalloid = metalloid;
        this.conductivity = conductivity;
    }
    public String toString(){
        
        return super.toString()+ ", "+(metalloid ? "Halbleiter, " : "")+ "\u03C3: "+ conductivity;
    }
}
