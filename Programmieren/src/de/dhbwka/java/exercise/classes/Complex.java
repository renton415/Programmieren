package de.dhbwka.java.exercise.classes;

public class Complex {
	private double real, imag;
	
	public Complex (double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public double getImag() {
		return imag;
	}
	
	public Complex add(Complex comp) {
		return new Complex(real + comp.getReal(), imag + comp.getImag());
	}
	public Complex sub(Complex comp) {
		return new Complex(real - comp.getReal(), imag - comp.getImag());
	}
	public Complex mult(Complex comp) {
		return new Complex((real * comp.getReal() - imag * comp.getImag()), (real*comp.getImag() + imag * comp.getReal()));
	}
	public Complex div(Complex comp) {
		double real_new = (real*comp.getReal() + imag*comp.getReal()) / (comp.getReal() * comp.getReal() + comp.getImag() * comp.getImag());
		double imag_new = (imag*comp.getReal() - real*comp.getImag()) / (comp.getReal() * comp.getReal() + comp.getImag() * comp.getImag());
		return new Complex(real_new, imag_new);
	}
}
