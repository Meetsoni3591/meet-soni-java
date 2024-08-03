package exceptionexample;

import java.util.Scanner;

public class CustomException {
	
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age ");
		n = sc.nextInt();
		try {
			if(n>=18) {
				System.out.println("you are eligible for votting");
				
			}else {
				
				throw new ArithmeticException();
			}
		}catch(ArithmeticException a) {
			System.out.println("better luck next time");
		}
	}
}
