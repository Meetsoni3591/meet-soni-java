package abstraction;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(String name, int acc) {
		super(name, acc);
		// TODO Auto-generated constructor stub
	}
	int balance = 0;
	int d1,d2;
	public int getD1() {
		return d1;
	}
	public void setD1(int d1) {
		this.d1 = d1;
	}
	public int getW1() {
		return w1;
	}
	public void setW1(int w1) {
		this.w1 = w1;
	}
	int w1;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int d) {
	 d1 = balance + d;
	System.out.println("balance after deposit"+d1);;

	}
	public void withdraw(int w) {
	 d2 = d1 - w;
	System.out.println("balance after withdraw" +d2);
	}
	@Override
	public String toString() {
		return "SavingsAccount [balance=" +  d1 + ", withdraw" + d2 + "]";
	}
	
	
	}
