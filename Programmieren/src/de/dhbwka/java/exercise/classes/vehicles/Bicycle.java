package de.dhbwka.java.classes.vehicles;

public class Bicycle extends Vehicle{
    int wheels = 2;
    double maxSpeed = 30;

    Bicycle(double speed) {
        //setSpeed(speed);
        this.speed = speed;
    }
    public String toString(){
        return super.toString()+ wheels+" wheels at speed "+speed+" km/h of max " + maxSpeed +" km/h";
    }
}
