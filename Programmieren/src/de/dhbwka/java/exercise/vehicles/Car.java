package de.dhbwka.java.exercise.vehicles;

public class Car extends Vehicle{
    int wheels = 4;
    int maxSpeed = 140;

    Car() {}

    Car(double speed) {
        setSpeed(speed);
    }
    public String toString(){
        return "Car" + super.toString();
    }
}
