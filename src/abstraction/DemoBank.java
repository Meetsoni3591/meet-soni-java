package abstraction;

public class DemoBank  {
	
public static void main(String[] args){
	SavingsAccount sa = new SavingsAccount("meet", 123);
	sa.deposit(100);
	sa.withdraw(50);
	System.out.println(sa);
	
}

}
