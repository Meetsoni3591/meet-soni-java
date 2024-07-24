package area;

public class DemoCircle extends Circle{
//	its gives an error because of final declaration in parent class
//	public void demo() {
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.getArea(5);
		c.demo();

	}

}
