package de.dhbwka.java.exercise.vehicles;

public class Vehicle {
    private int wheels = 0;
    private int maxSpeed = 0;
    private int position = 0;
    private int speed;

    void setSpeed(double speed) {
        if (speed > maxSpeed) {
            this.speed = maxSpeed;
        } else if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = (int)speed;
        }
    }

    void drive (double minutes) {
        if (minutes > 0 && speed > 0) {
            position += minutes/60 * speed; 
        }
    }
    public String toString(){
        return this.getClass().getSimpleName() + "with "+wheels+" wheels at speed "+speed+"km/h of max" + maxSpeed +" km/h";
    }

}
