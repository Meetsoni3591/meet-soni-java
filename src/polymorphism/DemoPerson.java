package polymorphism;

public class DemoPerson {
	public static void main(String args[]) {
		Address a = new Address("a101","jiv","ahmd",380051);
		Person p = new Person("meet","meet@gmail.com",a);
		System.out.println(p);
	}
	
	
}
