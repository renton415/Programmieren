package de.dhbwka.java.exercise.classes;

public class Polynomial {
	private double a, b, c;

	Polynomial (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String toString(){
		return a+"x^2 "+b+"x "+c;
	}
	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double functionValue(double x) {
		double f = a * x * x + b * x + c;
		return f;
	}
	
	public Polynomial add(Polynomial p) {
		return new Polynomial(a + p.getA(), b + p.getB(), c + p.getC());
	}
	
	public Polynomial scale(double factor) {
		return new Polynomial(a * factor, b + factor, c * factor);
	}
	
	 public double[] getZeros() { 
	        if (b*b<4*a*c)  // no zeros 
	            return new double[0]; 
	        else if (b*b==4*a*c)  // 1 zero 
	            return new double[] { -b/(2*a) }; 
	        else  // 2 zeros 
	            return new double[] { 
	            (-b+Math.sqrt(b*b-4*a*c))/(2*a), 
	            (-b-Math.sqrt(b*b-4*a*c))/(2*a) 
	            }; 
	    } 
}
