package exceptionexample;
import java.util.*;
public class ExceptionDemo {
	
	public static void main(String args[]) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number ");
		a=sc.nextInt();
		System.out.println("enter second number ");
		b=sc.nextInt();
		try {
			c=a/b;
			System.out.println("the result is "+ c);
		}catch(ArithmeticException arr){
			System.out.println(arr.getMessage());
		}
	}

}
 