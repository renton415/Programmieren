package de.dhbwka.java.exercise.classes.abstr;

public class RacingCar extends Car{
    double maxSpeed = 220.0; 
    RacingCar(double speed) {
        super(speed, 220);
    }
    public String toString(){
        return super.toString()+ wheels+" wheels at speed "+speed+" km/h of max " + maxSpeed +" km/h";
    }
}
