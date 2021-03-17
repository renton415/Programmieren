package de.dhbwka.java.exercise.classes.vehicles;

public class Ambulance extends Car{
    private boolean sirene = false;

    void setSirene (boolean on) {
        if (on) {
            sirene = true;
        } else {
            sirene = false;
        }
    }

    void turnOnSirene() {
        sirene = true;
    }

    void turnOffSirene() {
        sirene = false;
    }
    public String toString(){
        
        return super.toString()+ ". Sirene " + sirene;
    }

    Ambulance(double speed, boolean sirene) {
        super(speed);
        this.sirene = sirene;
    }
}
