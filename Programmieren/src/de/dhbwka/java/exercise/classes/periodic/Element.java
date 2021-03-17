package de.dhbwka.java.exercise.classes.periodic;

public class Element {
    String name;
    String symbol;
    int ordinal;
    String shell;
    int phase;
    boolean group;

    Element() {
        this.name = "";
        this.symbol = "";
        this.ordinal = 0;
        this.phase = 0;
        this.group = false;
    }

    public Element(String name, String symbol, int ordinal, String shell, int phase, boolean group) {
        this.name = name;
        this.symbol = symbol;
        this.ordinal = ordinal;
        this.shell = shell;
        this.phase = phase;
        this.group = group;
    }

    public boolean equals (Object o) {
        if (o instanceof Element) {
            Element e = (Element)o;
                return this.ordinal==e.getOrdinal();
        } else {
            return false;
        }
    }

    public String toString(){
        String text = new String();
        text += name+" ("+symbol+","+ordinal+") Schale: "+shell+", ";
        if (phase == 1) {
            text +="fest";
        } else if (phase == 2){
            text += "fluessig";
        } else if (phase == 3) {
            text += "gas";
        } else {
            text += "phase unbekannt";
        }
        text += ", group: "+ (group ? "Hauptgruppe" : "Nebengruppe");
        return text;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSymbol(){
        return symbol;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    public int getOrdinal(){
        return ordinal;
    }
    public void setOrdinal(int ordinal){
        this.ordinal = ordinal;
    }
    public String getShell(){
        return shell;
    }
    public void setShell(String shell){
        this.shell = shell;
    }
    public int getPhase(){
        return phase;
    }
    public void setPhase(int phase){
        this.phase = phase;
    }
    public boolean getGroup(){
        return group;
    }
    public void setPhase(boolean group){
        this.group = group;
    }
}
