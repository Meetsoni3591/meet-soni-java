package covariantexamples;

public class Addition extends Calculator{
	// you can access the child of Number which is integer but cannot access the Number as a child of INteger 
	
	public Integer getSum(int no1,int no2) {
		return (no1+no2);
	}

}
