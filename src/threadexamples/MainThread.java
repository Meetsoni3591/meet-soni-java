package threadexamples;

public class MainThread {

	public static void main(String[] args) {
		Thread1 thj = new Thread1();
		thj.start();
		try {
			thj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread2 th2 = new Thread2();
		Thread th1 = new Thread(th2);
		th1.start();
System.out.println(th1);

System.out.println();
	}

}
