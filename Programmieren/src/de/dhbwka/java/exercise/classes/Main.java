package de.dhbwka.java.exercise.classes;

public class Main {

	public static void main(String[] args) {
		Point pointA = new Point(4.0,2.0);
		System.out.println("A: "+pointA);
		System.out.println("Betrag: "+pointA.distance());
		
		Point pointB = new Point(-1.0,-1.0);
		System.out.println("B: "+pointB);
		System.out.println("Abstand: "+pointA.distanceToPoint(pointB));
		
		Point pointAmirrored = pointA.mirrorPoint();
		System.out.println("A': "+pointAmirrored);
		System.out.println("Abstand: "+pointB.distanceToPoint(pointAmirrored));
	}

}
