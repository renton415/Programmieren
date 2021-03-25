package de.dhbwka.java.exercise.classes.abstr;

public abstract class Vehicle {
    private int wheels;
    private double maxSpeed;
    private double position;
    protected double speed;

    public Vehicle(){
        this(0.0);
    }
    public Vehicle(double speed){
        this(0, speed, 0.0, 0);
    }
    public Vehicle(int wheels, double speed, double maxSpeed, double position){
        this.wheels = wheels;
        setSpeed(speed);
        this.maxSpeed = maxSpeed;
        this.position = position;
    }

    void setSpeed(double speed) {
        /*if (speed > maxSpeed) {
            this.speed = maxSpeed;
        } else if (speed < 0.0) {
            this.speed = 0.0;
        } else {
            this.speed = speed;
        }*/
        this.speed = 300.0;
    }

    void drive (double minutes) {
        if (minutes > 0 && speed > 0) {
            position += minutes/60 * speed; 
        }
    }
    public String toString(){
        return this.getClass().getSimpleName() + " with ";
    }

}
