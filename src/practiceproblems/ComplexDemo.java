package practiceproblems;
// Question 3 
public class ComplexDemo {
	public static void main(String[] args) {
		Complex c1 = new Complex(2.0,6.0);
		Complex c2 = new Complex(2.0, 3.0);
		System.out.println("The real numbers "+ c1);
		System.out.println("The other numbers "+ c2);
		System.out.println("the add of two number is " + c1.add(c2));
		System.out.println("the substraction of two numbers is " + c1.sub(c2));
		System.out.println("the multi of two number is " + c1.mul(c2));
		System.out.println("the division of two number is " + c1.div(c2));
	}
}
