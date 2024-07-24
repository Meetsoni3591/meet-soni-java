package constructor_inheritance;

public class DemoC {
	public static void main(String[] args) {
		City c = new City();
		City c1 = new City("baroda", " gujarat");
		State s = new City();   // upcasting  this is object of child class  
		System.out.println(c);
		System.out.println(c1);
		System.out.println(s);
	}

}
