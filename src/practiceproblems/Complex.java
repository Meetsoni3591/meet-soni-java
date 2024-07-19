package practiceproblems;
// Question 3 
public class Complex {
	
	private double realPart, imaginaryPart;

	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex add(Complex otherNumber) {

		double real = this.realPart + otherNumber.realPart;
		double imaginary = this.imaginaryPart + otherNumber.imaginaryPart;
		return new Complex(real, imaginary);
	}
	
	public Complex mul(Complex otherNumber) {
		double real = this.realPart * otherNumber.realPart;
		double imaginary = this.imaginaryPart * otherNumber.imaginaryPart;
		return new Complex(real, imaginary);
	}
	
	public Complex sub(Complex otherNumber) {
		double real = this.realPart - otherNumber.realPart;
		double imaginary = this.imaginaryPart - otherNumber.imaginaryPart;
		return new Complex(real, imaginary);
	}
	public Complex div(Complex otherNumber) {
		double real = this.realPart / otherNumber.realPart;
		double imaginary = this.imaginaryPart / otherNumber.imaginaryPart;
		return new Complex(real,imaginary);
	}
	
	

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	@Override
	public String toString() {
		return "Complex [realPart=" + realPart + ", imaginaryPart=" + imaginaryPart + "]";
	}
	
}
