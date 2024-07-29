package covariantexamples;

public class Calculator {
	public Number getSum(int no1, int no2) {
		// why we use covariant because we want to change its type in child class 
		return (no1+no2);
	}
}
