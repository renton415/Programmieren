package de.dhbwka.java.exercise.classes;

public class Point {
	private double x;
	private double y;
	
	Point () {
		x = 0.0;
		y = 0.0;
	}
	
	Point (double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String toString() {
		return "Punkt ("+x+","+y+")";
	}
	
	public float distance() {
		return (float) distanceToPoint(new Point(0.0, 0.0));
	}
	public Point mirrorX (Point p){
		return new Point(x,-y);
	}
	public Point mirrorY (){
		return new Point(-x,y);
	}
	public Point mirrorPoint() {
		return new Point(-x,-y);
	}
	public float distanceToPoint (Point p) {
		return (float) Math.sqrt(Math.pow((p.getX()-x),2)  + Math.pow((p.getY()-y),2));
	}
}
