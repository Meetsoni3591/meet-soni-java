package interfaceexample;

// why we use interface because we cannot use multiple inhheritance that why we use interface 
public class Car implements Vehicle {
	@Override
	public void getName() {
		System.out.println("hello");
	}

}	
