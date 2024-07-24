package staticexmp;

public class StaticExp {
	static String str = "demo string";
	 int i = 0;
	static int count = 0;
	public StaticExp() {
	i++;
	++count;
	}
	
	public static void getData() {
		System.out.println(count);
//		it can't access non static filed's
//		System.out.println(i); 
	}
	static {
		System.out.println("this is call very first");
	}
	@Override
	public String toString() {
		return "i " + i ;
	}
	

}
