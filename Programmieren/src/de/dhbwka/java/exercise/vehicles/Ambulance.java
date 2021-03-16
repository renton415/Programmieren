package de.dhbwka.java.exercise.vehicles;

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
        super.toString();
        return "Ambulance" + super.toString() + " Sirene " + sirene;
    }

    Ambulance(double speed, boolean sirene) {
        setSpeed(speed);
        this.sirene = sirene;
    }
}
