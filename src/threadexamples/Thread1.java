package threadexamples;

public class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}

}
