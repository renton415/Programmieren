package de.dhbwka.java.exercise.vehicles;

public class Car extends Vehicle{
    int wheels = 4;
    double maxSpeed = 140;

    Car() {}
    Car(double speed) {
        super(4, speed, 140.0, 0);
    }
    Car(double speed, double maxSpeed) {
        super(4, speed, 140.0, maxSpeed);
    }
    public String toString(){
        return super.toString()+ wheels+" wheels at speed "+speed+" km/h of max " + maxSpeed +" km/h";
    }
}
