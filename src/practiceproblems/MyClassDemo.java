package practiceproblems;
// Question 1 
public class MyClassDemo {
	public static void main(String[] args)
	   {
	        MyClass myObject1 = new MyClass(5);
	        MyClass myObject2 = new MyClass(8);
	        myObject1.printX();
	        myObject1.incrementCount();
	        MyClass myClass = new MyClass(3);
			myClass.incrementCount();
	        myObject1.printCount();
//	        myObject2.printCount();
	        myObject2.printX();
	        myObject1.setX(14);
	        myObject1.incrementCount();
	        myObject1.printX();
	        myObject1.printCount();
//	        myObject2.printCount();
	   }
	
}
