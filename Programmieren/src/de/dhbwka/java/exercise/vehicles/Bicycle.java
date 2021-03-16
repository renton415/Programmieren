package de.dhbwka.java.exercise.vehicles;

public class Bicycle extends Vehicle{
    int wheels = 2;
    int maxSpeed = 30;

    Bicycle(double speed) {
        setSpeed(speed);
    }
    public String toString(){
        return "Bicycle" + super.toString();
    }
}
