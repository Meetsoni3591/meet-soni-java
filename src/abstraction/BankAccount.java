package abstraction;

public abstract class BankAccount {
	public String name;
	public int acc;
	
	public BankAccount(String name, int acc) {
//		super();
		this.name = name;
		this.acc = acc;
	}
	public abstract void deposit(int d );
	public abstract void withdraw(int w);
	

}
