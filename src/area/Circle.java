package area;

public class Circle {
	private final double pi = 3.14;
	public void getArea(int r) {
		System.out.println(pi*r*r);
	}
	public final void demo() {
		final int r =10;
		System.out.println(pi*r*r);
		
	}
	

}
