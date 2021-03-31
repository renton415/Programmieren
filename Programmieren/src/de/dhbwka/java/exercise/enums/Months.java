package de.dhbwka.java.exercise.enums;

import java.util.Calendar;

public enum Months{
    JANUAR("Januar", 31, "Hartung, Eismond"),
    FEBRUAR("Februar",28,"Hornung, Schmelzmond, Taumond, Narrenmond, Rebmond, Hintester"),
    MAERZ("Maerz", 31, "Lenzing, Lenzmond"),
    APRIL("April", 30,"Launing, Ostermond"),
    MAI("Mai", 31, "Winnemond, Blumenmond"),
    JUNI("Juni", 30,"Brachet, Brachmond"),
    JULI("Juli", 31, "Heuert, Heumond"), 
    AUGUST("August", 31, "Ernting, Erntemond, Bisemond"),
    SEPTEMBER("September",30,"Scheiding, Herbstmond"),
    OKTOBER("Oktober", 31, "Gilbhart, Gilbhard, Weinmond"),
    NOVEMBER("November", 30, "Nebelung, Windmond, Wintermond"),
    DEZEMBER("Dezember", 31, "Julmond, Heilmond, Christmond, Dustermond");

    private String name;
    private int days;
    private String altNames;

    Months(String name, int days, String altNames) {
        this.name = name;
        this.days = days;
        this.altNames = altNames;
    }
    public String getName() {
        return this.name;
    }
    public int getDays() {
        return this.days;
    }
    public String getAltNames() {
        return this.altNames;
    }
    public static void main(String[] args){
        int thisMonth =  Calendar.getInstance().get(Calendar.MONTH);
        for (Months m : Months.values()) {
            if (m.ordinal() == thisMonth) {
                System.out.println("Der "+ m.getName()+ " hat "+m.getDays()+" Tage und hiess frueher '"+m.getAltNames()+"'.");
            }
        }
    }
}
